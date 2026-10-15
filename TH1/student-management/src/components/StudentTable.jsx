import React from 'react';
import StudentItem from './StudentItem';

const StudentTable = ({ students, onDelete }) => {
  if (students.length === 0) {
    return <p className="empty-message">Không có sinh viên nào phù hợp với bộ lọc.</p>;
  }

  return (
    <div className="table-wrapper">
      <table className="student-table">
        <thead>
          <tr>
            <th>ID</th>
            <th>Họ và Tên</th>
            <th>Lớp</th>
            <th>Điểm số</th>
            <th>Thao tác</th>
          </tr>
        </thead>
        <tbody>
          {students.map((student) => (
            <StudentItem 
              key={`student-row-${student.id}`} 
              student={student} 
              onDelete={onDelete} 
            />
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default StudentTable;