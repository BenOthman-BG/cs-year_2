DECLARE
 e_unique EXCEPTION ;
 PRAGMA EXCEPTION_init (e_unique , -1);
BEGIN
    INSERT into client VALUES (1 , 'Ahmed' ,'maaziz' , 'morroco');
EXCEPTION 
 WHEN e_unique THEN 
  DBMS_OUTPUT.put_line('deja exist ');
end ;
