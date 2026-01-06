declare 
 V_des article.des%type ;
 V_qte vente.qte%TYPE ;
 V_nom client.nom%type ;
 V_dat vente.DAT%TYPE;
 V_number client.num_c%type ;
 CURSOR mon_cursor( V_num_c  client.num_c%type ) is 
 SELECT article.des as article_des , vente.qte as qte_totale , client.nom as cilent_nom , client.num_c as client_num_c  , vente.dat as vente_dat 
 from article , vente , client 
 where article.num_a = vente.num_a and client.num_c = vente.num_c 
 and client.num_c = V_num_c ;

BEGIN 
    open mon_cursor(1);
    loop 
     FETCH mon_cursor into V_des , V_qte , V_nom , V_number ,V_dat ;
     EXIT WHEN mon_cursor%notfound ;
     DBMS_OUTPUT.PUT_LINE('num_client : ' || V_number|| '| nom : ' ||V_nom || '| des : '|| V_des|| '| qte : ' || V_qte || '| Date : '|| V_dat);
    END LOOP ;
    CLOSE mon_cursor;
END ;

     

  