DECLARE 
  V_nom client.nom%type ;
  V_ville client.ville%type ;
  CURSOR cursor_f is
  SELECT nom as nom_client , ville as ville_client from client WHERE ville = 'Gabes' ;
BEGIN 
    open cursor_f ;
    LOOP
        FETCH cursor_f into V_nom , V_ville;
        EXIT WHEN cursor_f%notfound ;
        DBMS_OUTPUT.PUT_LINE('Helo M.' || V_nom || ' your city is ' || V_ville || ' hop you are great ' );
    END LOOP ;
    CLOSE cursor_f;
end ;


