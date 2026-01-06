DECLARE 
 othman EXCEPTION ;
 v_qte NUMBER := -10 ;
BEGIN 
    if v_qte < 0 then 
     RAISE othman ;
    end if ;
    DBMS_OUTPUT.PUT_LINE('QTE : ' || v_qte);
    EXCEPTION 
      WHEN othman then 
         DBMS_OUTPUT.PUT_LINE('waaaa3 ');
end ;