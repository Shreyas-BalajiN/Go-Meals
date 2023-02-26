import "bootstrap/dist/css/bootstrap.min.css";
import "./App.css";
import Register from "./pages/Register";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Login from "./pages/Login";
import SupplierRegister from "./pages/SupplierRegister"

function App() {
  return (
    <div className="App">
      <Router>
        <Routes>
          <Route path="/login" element={<Login />} />
          <Route path="/register" element={<Register />} />
          <Route path="/SupplierRegister" element={<SupplierRegister />} />
          <Route path="/" element={<Register />} />
        </Routes>
      </Router>
    </div>
  );
}

export default App;
