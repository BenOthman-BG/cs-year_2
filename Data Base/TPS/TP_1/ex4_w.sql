DECLARE
 v_nom client.nom%type ;
BEGIN 
    UPDATE article set prix_achat = (prix_achat - prix_achat * 0.9 ) where num_f = 1;
END;

