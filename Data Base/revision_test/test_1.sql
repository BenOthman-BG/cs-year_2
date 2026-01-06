DECLARE 
  V_nom client.nom%type ;
Begin 
 SELECT nom into V_nom from client where num_c = 20 ;
 DBMS_OUTPUT.PUT_LINE('heloo Mr.'|| V_nom ||' Hope you good ');
EXCEPTION
    WHEN NO_DATA_FOUND then 
      DBMS_OUTPUT.PUT_LINE('waloooo');
    WHEN OTHERS THEN 
      DBMS_OUTPUT.PUT_LINE('ninvinvienvi');
END;