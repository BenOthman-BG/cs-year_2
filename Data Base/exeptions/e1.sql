-- BEGIN 
--     -- code principale 
--  Exeption 
--   when nom_exeption then 
--   -- l'exeption 
-- End;

DECLARE 
 v_res NUMBER ;
BEGIN 
    v_res := 10 / 0 ;
    DBMS_OUTPUT.PUT_LINE('Resultatt = ' || v_res );
Exception
  when ZERO_DIVIDE then 
    DBMS_OUTPUT.PUT_LINE(' ERROR : DIVISION PAR ZERO ');
End ;