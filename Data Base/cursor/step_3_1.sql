BEGIN 
    for rec in (
        SELECT sum(vente.qte) as qte_totale , article.des as article_des 
        from vente  , article 
        where vente.num_a = article.num_a 
        group by article.DES 

    )loop 
    DBMS_OUTPUT.put_line(
        ' -Article : ' || rec.article_des ||
        ' -Quantite : '|| rec.qte_totale || ' . '
    );
    end loop;
end ;
