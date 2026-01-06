declare 
 V_qte number;
 V_nom client.nom%type ;
 V_number client.num_c%type ;
BEGIN 
    SELECT sum(vente.qte) as qte_totale , client.nom as cilent_nom , client.num_c as client_num_c  
    into V_qte , V_nom , V_number 
    from  vente , client 
    where client.num_c = vente.num_c 
    group by client.num_c , client.nom ;
    DBMS_OUTPUT.PUT_LINE('num_client : ' || V_number|| '| nom : ' ||V_nom || '| qte_totale : ' || V_qte );
END ;

     

  