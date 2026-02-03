import { StrictMode } from "react";
import { createRoot } from "react-dom/client";
import "./index.css";
import App from "./App.jsx";
import HelloWorld from "./HelloWorld/Helloworld.jsx";



createRoot(document.getElementById("root")).render(
  <StrictMode>
    <HelloWorld />
    <App name="Ali" />
    <App name="Othman" />
    <App name="Ali" />
  </StrictMode>,
);
