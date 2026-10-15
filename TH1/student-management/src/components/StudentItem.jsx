import React from 'react';

const StudentItem = ({ student, onDelete }) => {
  const { id, name, score, studentClass } = student;

  const handleDelete = () => {
    onDelete(id);
  };

  return (
    <tr>
      <td>{id}</td>
      <td>{name}</td>
      <td>{studentClass}</td>
      <td>
        <span className={`score-badge ${score >= 8 ? 'score-good' : score < 5 ? 'score-fail' : ''}`}>
          {score}
        </span>
      </td>
      <td>
        <button 
          className="btn-delete" 
          onClick={handleDelete}
        >
          Xóa
        </button>
      </td>
    </tr>
  );
};

export default StudentItem;