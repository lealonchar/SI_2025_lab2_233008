# SI_2025_lab2_233008

Леа Лончар 233008

2. https://drive.google.com/file/d/15ESsfTGrYDZC_Wa6SCUriF1H8YgBtjoR/view?usp=drive_link
3. Цикломатската комплексност е 9. Тоа може да се види преку тоа што има 8 региони на графот.
4. Минимално се потребни 6 тест случаи

Item={ Name="L", price=120, discount=0, quantity=3}, Card = "1234567891234567"
Без попуст и грешки, нормален тек на кодот

Item={ Name="L", price=320, discount=0, quantity=3}, Card = "1234567891234567"
Цена поголема од 300 и без попуст

Item={ Name="L", price=120, discount=0.2, quantity=3}, Card = "1234567891234567"
Цена помала од 300 со попуст

Item={ Name=null, price=120, discount=0, quantity=3}, Card = "1234567891234567"
Невалиден item

Item={ Name="L", price=120, discount=0, quantity=3}, Card = "12345"
Невалиден број на картичка поради грешна должина

Item={ Name="L", price=120, discount=0.2, quantity=3}, Card = "123456789123456m"
Невалиден број на картичка поради грешни карактери

5. Бидејќи во (item.getPrice() > 300 || item.getDiscount() > 0 || item.getQuantity() > 10) има 3 услови потребни се минимално 4 тест случаи да се покријат сите случаи. 

Item={ Name="L", price=320, discount=0, quantity=3}
Цена поголема од 300(T), други вредности можат да бидат било што

Item={ Name="L", price=120, discount=0.2, quantity=3}
Цена помала од 300(F), попуст поголем од 0(T), другите вредности може да се било што

Item={ Name="L", price=120, discount=0, quantity=20}
Цена помала од 300(F), попуст поголем од 0(F), количина поголема од 10(T)

Item={ Name="L", price=120, discount=0, quantity=1}
Цена помала од 300(F), попуст поголем од 0(F), количина помала а од 10(F)
   
