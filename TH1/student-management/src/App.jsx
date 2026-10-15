import React, { useState } from 'react';
import StudentTable from './components/StudentTable';
import './App.css';

const INITIAL_STUDENTS = [
  { id: 1, name: 'Nguyễn Văn An', score: 8.5, studentClass: 'D22CNPM01' },
  { id: 2, name: 'Trần Thị Bình', score: 4.2, studentClass: 'D22CNPM02' },
  { id: 3, name: 'Lê Hoàng Cường', score: 9.0, studentClass: 'D22CNPM01' },
  { id: 4, name: 'Phạm Thu Duyên', score: 6.8, studentClass: 'D22CNPM03' },
];

const App = () => {
  const [students, setStudents] = useState(INITIAL_STUDENTS);
  const [filterType, setFilterType] = useState('ALL');
  const [formData, setFormData] = useState({
    name: '',
    score: '',
    studentClass: '',
  });
  const [errorMessage, setErrorMessage] = useState('');

  const handleInputChange = (e) => {
    const { name, value } = e.target;
    setFormData((prev) => ({
      ...prev,
      [name]: value,
    }));
  };

  const handleAddStudent = (e) => {
    e.preventDefault();
    const { name, score, studentClass } = formData;

    if (!name.trim() || !score.trim() || !studentClass.trim()) {
      setErrorMessage('Vui lòng điền đầy đủ các thông tin!');
      return;
    }

    const parsedScore = Number(score);

    if (isNaN(parsedScore) || parsedScore < 0 || parsedScore > 10) {
      setErrorMessage(`Điểm số không hợp lệ (${score}). Điểm phải từ 0 đến 10!`);
      return;
    }

    const newStudent = {
      id: Date.now(),
      name: name.trim(),
      score: parsedScore,
      studentClass: studentClass.trim(),
    };

    setStudents((prev) => [...prev, newStudent]);
    setFormData({ name: '', score: '', studentClass: '' });
    setErrorMessage('');
  };

  const handleDeleteStudent = (id) => {
    setStudents((prev) => prev.filter((student) => student.id !== id));
  };

  const filteredStudents = students.filter((student) => {
    if (filterType === 'EXCELLENT') return student.score >= 8.0;
    if (filterType === 'FAIL') return student.score < 5.0;
    return true;
  });

  const totalStudents = students.length;
  const averageScore = totalStudents > 0
    ? (students.reduce((sum, item) => sum + item.score, 0) / totalStudents).toFixed(2)
    : '0.00';

  return (
    <div className="container">
      <header className="app-header">
        <h1>Quản lý Điểm Sinh viên</h1>
      </header>

      <section className="stats-panel">
        <div className="stat-card">
          <span className="stat-title">Tổng sinh viên toàn lớp</span>
          <span className="stat-value">{`${totalStudents} sinh viên`}</span>
        </div>
        <div className="stat-card">
          <span className="stat-title">Điểm trung bình toàn lớp</span>
          <span className="stat-value">{`${averageScore} điểm`}</span>
        </div>
      </section>

      <section className="card form-section">
        <h2>Thêm sinh viên mới</h2>
        {errorMessage && <div className="error-alert">{errorMessage}</div>}
        <form onSubmit={handleAddStudent} className="student-form">
          <div className="form-group">
            <label>Họ và Tên:</label>
            <input
              type="text"
              name="name"
              placeholder="VD: Nguyễn Văn A"
              value={formData.name}
              onChange={handleInputChange}
            />
          </div>
          <div className="form-group">
            <label>Lớp:</label>
            <input
              type="text"
              name="studentClass"
              placeholder="VD: D22CNPM01"
              value={formData.studentClass}
              onChange={handleInputChange}
            />
          </div>
          <div className="form-group">
            <label>Điểm số (0 - 10):</label>
            <input
              type="number"
              step="0.1"
              name="score"
              placeholder="VD: 8.5"
              value={formData.score}
              onChange={handleInputChange}
            />
          </div>
          <button type="submit" className="btn-add">Thêm sinh viên</button>
        </form>
      </section>

      <section className="card list-section">
        <div className="filter-bar">
          <h2>Danh sách sinh viên</h2>
          <div className="filter-buttons">
            <button
              className={`filter-btn ${filterType === 'ALL' ? 'active' : ''}`}
              onClick={() => setFilterType('ALL')}
            >
              Tất cả ({students.length})
            </button>
            <button
              className={`filter-btn ${filterType === 'EXCELLENT' ? 'active' : ''}`}
              onClick={() => setFilterType('EXCELLENT')}
            >
              Giỏi (&ge; 8.0)
            </button>
            <button
              className={`filter-btn ${filterType === 'FAIL' ? 'active' : ''}`}
              onClick={() => setFilterType('FAIL')}
            >
              Trượt môn (&lt; 5.0)
            </button>
          </div>
        </div>

        <StudentTable 
          students={filteredStudents} 
          onDelete={handleDeleteStudent} 
        />
      </section>
    </div>
  );
};

export default App;