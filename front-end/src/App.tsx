import { useState } from 'react'
import viteLogo from '/vite.svg'
import './App.css'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <div className="login-container">
        <h1>Login</h1>
          <div>
            <a href="https://vitejs.dev" target="_blank">
              <img src={viteLogo} className="logo" alt="Vite logo" />
            </a>
          </div>
          <div className="login">
            <input type="text" placeholder="Login" />
          </div>
          <div className="senha">
            <input type="password" placeholder="Senha" />
          </div>
          <button onClick={() => setCount((count) => count + 1)}>
            Entrar {count}
          </button>
          <a href="instagram.com" target="_blank">Registrar-se</a>
          <p>
            Edit <code>src/App.tsx</code> and save to test HMR
          </p>
        </div>
      <p className="read-the-docs">
        Click on the Vite and React logos to learn more
      </p>
    </>
  )
}

export default App
