DECLARE 
    V_qte vente.qte%type ;
    V_nom client.nom%type ;
    CURSOR mon_cursor( V_nom_c in  client.nom%type ) is 
    SELECT sum(vente.qte) as qte_totale , client.nom as client_nom 
    from vente , client 
    where  vente.num_c = client.num_c and client.nom = v_nom_c  
    group by client.nom ;
begin 
 open mon_cursor ('&V_nom_c');
 loop 
  FETCH mon_cursor INTO V_qte , V_nom;
  EXIT when mon_cursor%notfound;
      DBMS_OUTPUT.put_line(
        'client : ' || V_nom||
        ' -> Quantite : '|| V_qte || ' . '
    );
  end LOOP ;
  CLOSE mon_cursor;
end;






