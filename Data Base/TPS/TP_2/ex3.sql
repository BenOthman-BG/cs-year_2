DECLARE 
 V_qte number;
 V_up number ;
 V_stock number;
 CURSOR othman is 
   select stock from article where num_a = 1 ;
BEGIN 
    open  othman ; 
    FETCH othman into V_stock ;
    V_qte := 132; 
    if V_qte > V_stock then 
      RAISE_Application_error(-20002 , 'quantite grand than stok -> '||V_stock);
    end if ;
       INSERT INTO vente VALUES (2 , 5, 1, V_qte , 500 , TO_DATE('12-10-2025' , 'DD-MM-YY'));
       V_up := V_stock - V_qte;
       UPDATE ARTICLE set stock = V_up where num_a = 1 ; 
    close othman ;

end ; 
    
