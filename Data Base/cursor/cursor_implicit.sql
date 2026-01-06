DECLARE
 v_nom client.nom%type ;
 V_ville client.ville%type ;
BEGIN 
    SELECT nom  , ville INTO v_nom ,V_ville  from client WHERE num_c = 1 ;
    DBMS_OUTPUT.PUT_LINE('hello M.' || v_nom|| ' your ville is : ' || V_ville);
END;

