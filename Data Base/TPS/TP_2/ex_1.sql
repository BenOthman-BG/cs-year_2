declare 
 V_qte vente.QTE%TYPE;
 V_nom client.nom%type ;
 V_prix_vente vente.PRIX_VENTE%TYPE ;
 S_ NUMBER := 0  ;
 V_number client.num_c%type ;
 CURSOR mon_cursor is 
 SELECT vente.qte  as qte_totale , vente.prix_vente  , client.nom as cilent_nom , client.num_c as client_num_c  
 from  vente , client 
 where client.num_c = vente.num_c 
 and  client.num_c = 2 ;
 
BEGIN 
    open mon_cursor ;
    loop 
     FETCH mon_cursor into  V_qte  , V_prix_vente   ,V_nom, V_number ;
     EXIT WHEN mon_cursor%notfound ;
     S_ := S_ + V_qte * V_prix_vente ;
    END LOOP ;
    DBMS_OUTPUT.PUT_LINE('num_client : ' || V_number|| '| nom : ' ||V_nom || '| revenu : ' || S_ );
    CLOSE mon_cursor;
END ;