create or replace procedure inserer_client (
   p_num_client in client.num_c%type,
   p_nom        in client.nom%type
) is
   v_existe number;
begin

   select count(*)
     into v_existe
     from client
    where num_c = p_num_client;

   if v_existe > 0 then
      dbms_output.put_line('Erreur : Ce client existe déjà.');
   else
  
      insert into client (
         num_c,
         nom

      ) values ( p_num_client,
                 p_nom
 );
      dbms_output.put_line('Client inséré avec succès.');
   end if;
end inserer_client;

BEGIN
    INSERER_CLIENT();
END ;