create or REPLACE function calc_montant (V_num_c in  client.num_c%type) 
return number 
is 
V_montant number := 0  ; 
V_nom client.nom%type ;
V_prix_vente vente.PRIX_VENTE%TYPE;
V_qte vente.QTE%TYPE;
CURSOR othman is 
 SELECT qte , prix_vente  , nom  from vente , client   where vente.num_c = client.num_c and client.num_c = V_num_c;
BEGIN 
    open othman ;
    loop 
     FETCH othman into V_qte ,V_prix_vente ,V_nom ;
     EXIT when othman%notfound ;
     V_montant := V_montant + V_qte * V_prix_vente ;
    end loop ;
    CLOSE othman ;
    return V_montant ;
end;
    
/

DECLARE
  v_m number ;
begin 
 v_m := calc_montant(1);
 dbms_output.put_line(' le mantant est : ' ||v_m);
end ;
/



     
    