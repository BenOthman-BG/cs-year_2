DECLARE
V_nom frs.nom%type ;
BEGIN
 SELECT nom into V_nom from frs where ville = 'Soupppsse';
 dbms_output.put_line('Nom : '||V_nom);
EXCEPTION
  WHEN TOO_MANY_ROWS then 
    dbms_output.put_line('bzaf dakxi ');
  WHEN NO_DATA_FOUND then 
    dbms_output.put_line('mkaynx alm3alem');
  WHEN OTHERS then 
    dbms_output.put_line('xi haja tma ');

end ;
    