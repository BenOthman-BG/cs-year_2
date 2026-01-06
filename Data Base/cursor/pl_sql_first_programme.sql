declare
   v_nom client.nom%type;
   cursor curseure_f is
   select nom as client_nom
     from client;
begin
   open curseure_f;
   loop
      fetch curseure_f into v_nom;
      exit when curseure_f%notfound;
      dbms_output.put_line('Helo M.'
                           || v_nom || ' hop you great ');
   end loop;
   close curseure_f;
end;