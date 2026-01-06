BEGIN 
    for rec in (
        SELECT sum(vente.qte) as qte_totale , client.nom as client_nom 
        from vente , client , article 
        where vente.num_c = client.num_c  
        group by client.nom

    )loop 
    DBMS_OUTPUT.put_line(
        'client : ' || rec.client_nom ||
        ' -Quantite : '|| rec.qte_totale || ' . '
    );
    end loop;
end ;
