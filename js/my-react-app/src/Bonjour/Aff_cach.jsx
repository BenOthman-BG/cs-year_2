import React , {useState} from "react";   

function Aff_cach () {

    const [visible, setVisible] = useState(true);

    const toggleVisibility = () => {
    setVisible(!visible); 
  };



    return(
  <>
    <div >
      <h2>Exercice 2: Afficher / Cacher le texte</h2>

     
      <button onClick={toggleVisibility}>
        {visible ? "Cacher" : "Afficher"}
      </button>

      {visible && <p>Le texte est visible !</p>}
    </div>
    </>
  );

}

export default Aff_cach;