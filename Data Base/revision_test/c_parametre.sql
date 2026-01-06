DECLARE 
 V_nom client.nom%TYPE;
 V_pays client.pays%type;
 V_ville client.ville%type;
 CURSOR Othman (V_num_c client.num_c%type) IS 
 SELECT nom , pays , ville from client WHERE num_c = V_num_c ; 
BEGIN
    OPEN othman(999);
    loop 
     FETCH othman into V_nom , V_pays , V_ville ;
     EXIT WHEN othman%notfound;
     DBMS_OUTPUT.PUT_LINE('Nom : '||V_nom||' | pays : '||V_pays|| ' | Ville : '||V_ville);
    end LOOP ;
    CLOSE othman ;
EXCEPTION
    WHEN NO_DATA_FOUND then 
      DBMS_OUTPUT.PUT_LINE('waloooo');
    WHEN OTHERS THEN 
      DBMS_OUTPUT.PUT_LINE('ninvinvienvi');
    
end ;



