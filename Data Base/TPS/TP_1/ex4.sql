

 BEGIN 
    for rec in (
        SELECT frs.num_f as id  , frs.nom as frs_nom ,  sum(article.prix_achat) as prix_achat_totale 
        from frs , article
        where frs.num_f = article.num_f 
        group by frs.num_f , frs.nom 

    )loop 
    DBMS_OUTPUT.put_line(
        'id  : ' || rec.id||
        ' | nom  : '|| rec.frs_nom|| 
        ' | prix_achat : '|| (rec.prix_achat_totale - rec.prix_achat_totale * 0.9 )
    );
    end loop;
end ;

