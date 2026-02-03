import React , {useState} from "react";    

function Bonjour() {
  const [texte , setTexte ] = useState("Bonjour !");

  const changerTexte = () => {
    setTexte("Bonsoir !");
  };
  
  return (
    <>
      <h1>{texte}</h1>
      <button onClick={changerTexte}>Changer le texte</button>
    </>
  );
}

export default Bonjour