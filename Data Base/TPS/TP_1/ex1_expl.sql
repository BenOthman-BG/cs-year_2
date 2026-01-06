declare 
 V_qte number;
 V_nom client.nom%type ;
 V_number client.num_c%type ;
 CURSOR mon_cursor is 
 SELECT sum(vente.qte) as qte_totale , client.nom as cilent_nom , client.num_c as client_num_c  
 from  vente , client 
 where client.num_c = vente.num_c 
 group by client.num_c , client.nom ;

BEGIN 
    open mon_cursor ;
    loop 
     FETCH mon_cursor into  V_qte , V_nom , V_number  ;
     EXIT WHEN mon_cursor%notfound ;
     DBMS_OUTPUT.PUT_LINE('num_client : ' || V_number|| '| nom : ' ||V_nom || '| qte_totale : ' || V_qte );
    END LOOP ;
    CLOSE mon_cursor;
END ;

     

  