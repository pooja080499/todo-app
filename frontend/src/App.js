import React, { useEffect, useState } from 'react';
import axios from 'axios';

function App() {
  const [tasks, setTasks] = useState([]);
  const [task, setTask] = useState('');

  const loadTasks = () => {
    axios.get("http://localhost:8080/api/todos")
      .then(res => setTasks(res.data));
  }

  const addTask = () => {
    axios.post("http://localhost:8080/api/todos", { title: task, completed: true })
      .then(() => {
        setTask('');
        loadTasks();
      });
  }

  const deleteTask = (id) => {
    axios.delete(`http://localhost:8080/api/todos/${id}`)
      .then(loadTasks);
  }

  useEffect(() => {
    loadTasks();
  }, []);

  return (
    <div>
      <h1>ToDo App</h1>
      <input value={task} onChange={e => setTask(e.target.value)} />
      <button onClick={addTask}>Add</button>

      <ul>
        {tasks.map(t => (
          <li key={t.id}>
            {t.title}
            <button onClick={() => deleteTask(t.id)}>❌</button>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;
