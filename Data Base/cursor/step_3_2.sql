DECLARE 
    V_qte vente.qte%type ;
    V_qte_tem vente.qte%type ;
    V_nom client.nom%type ;
    CURSOR mon_cursor( V_nom_c in  client.nom%type ) is 
    SELECT sum(vente.qte) as qte_totale , client.nom as client_nom 
    from vente , client 
    where  vente.num_c = client.num_c and client.nom = v_nom_c  
    group by client.nom ;
begin 
 open mon_cursor ('Jerbi Slim');
 loop 
  FETCH mon_cursor INTO V_qte , V_nom;
  EXIT when mon_cursor%notfound;
  V_qte_tem := ( V_qte * 100 ) / 2541.65 ;
      DBMS_OUTPUT.put_line(
        'client : ' || V_nom||
        ' -> Quantite : '|| V_qte_tem || '% '
    );
  end LOOP ;
  CLOSE mon_cursor;
end;
