DECLARE 
  V_des article.des%type ;
  V_qte_tem vente.qte%type ;
  V_qte vente.qte%type ;
  CURSOR mon_cursor is 
  SELECT article.des as client_des , sum(vente.qte) as qte_total 
  FROM article , vente 
  where article.num_a = vente.num_a
  group by article.des ;
begin
  OPEN mon_cursor ;
  LOOP 
    FETCH mon_cursor into V_des , V_qte ;
    V_qte_tem := ( V_qte * 100 ) / 2541.65 ;
    EXIT when mon_cursor%notfound ;
    DBMS_OUTPUT.PUT_LINE('Des : ' || V_des || '-> qte totale : ' || V_qte_tem ||'%');
  END loop ;
  CLOSE mon_cursor;
END ;




