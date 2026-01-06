create or replace function calculer_stock_restant (
   p_num_article in article.num_a%type
) return number is
   v_stock number;
begin
  -- Requête pour récupérer le stock
   select stock
     into v_stock
     from article
    where num_a = p_num_article;

   return v_stock;
exception
   when no_data_found then
    -- Retourne NULL si l'article n'existe pas
      return null;
end calculer_stock_restant;

DECLARE 
  v_stock Number ;

BEGIN 
    v_stock := CALCULER_STOCK_RESTANT(1);
    DBMS_OUTPUT.PUT_LINE( v_stock);
end ;
