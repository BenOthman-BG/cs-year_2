create or replace function calculer_stock_restant (
   p_num_article in article.num_a%type
) return number is
   v_stock article.stock%type;   -- type cohérent avec la colonne STOCK
begin
   select stock
     into v_stock
     from article
    where num_a = p_num_article;

   return v_stock;
exception
   when no_data_found then
      return null;
end calculer_stock_restant;
/

SET SERVEROUTPUT ON;

declare
   v_stock_restant number;
begin
   v_stock_restant := calculer_stock_restant(1);
   if v_stock_restant is null then
      dbms_output.put_line('Article introuvable.');
   else
      dbms_output.put_line('Stock restant : '|| v_stock_restant);
   end if;
end;
/