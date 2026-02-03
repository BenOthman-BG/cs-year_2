import { StrictMode } from "react";
import { createRoot } from "react-dom/client";
import "./index.css";
import Bonjour from "./Bonjour/Bonjour.jsx";
import Aff_cach from "./Bonjour/Aff_cach.jsx";
import Exercice3 from "./Bonjour/Exercice3.jsx";



createRoot(document.getElementById("root")).render(
  <StrictMode>
     <Bonjour />
     <Aff_cach />
     <Exercice3 />
  </StrictMode>,
);
