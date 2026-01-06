DECLARE 
 v_nom client.nom%TYPE ;
BEGIN 
    SELECT nom into v_nom from client WHERE num_c = 20000 ; 
    DBMS_OUTPUT.PUT_LINE('nom : ' || v_nom);
EXCEPTION 
 WHEN NO_DATA_FOUND THEN 
  DBMS_OUTPUT.PUT_LINE('ERROR : DATA_ WALO ');
END ;