/*java.util.HashMap<K,V> veri yapısı ile kargo takip programı yazmanız istenmektedir.
Bir paket girdisi kargo takip numarası ve alıcı isminden oluşmaktadır. Bir alıcıya
birden fazla paket girdisi kayıtlı olabilir ancak bir takip numarası yalnızca bir paket
girdisine aittir. Programınızın aşağıdaki menüyü sunması ve bu işlemleri
gerçekleştirebilmesi gerekir:
1. Paketleri listele
2. Paket ekle
3. Paket Sil
4. Bir alıcıya ait tüm paketlerini listele
5. Alıcı listele
6. Paket numaralarını listele
7. Tüm alıcıları listele (Alıcı isimleri tekrar etmemeli)
8. Çıkış
Kullanıcı 1 girdiğinde kayıtlı tüm girdiler listelenir.
Kullanıcı 2 girdiğinde takip numarası ve alıcı ismi ile paket ekleme işlemi yapılır.
Kullanıcı 3 girdiğinde verilen takip numarasına ait giriş silinir.
Kullanıcı 4 girdiğinde verilen alıcı ismine ait tüm paketler ekrana yazılır.
Kullanıcı 5 girdiğinde verilen takip numarasına ait alıcı (varsa) ekrana yazılır.
Kullanıcı 6 girdiğinde tüm takip numaraları ekrana yazılır.
Kullanıcı 7 girdiğinde tüm alıcı isimleri ekrana yazılır, bir alıcı iki kez ekrana yazılmaz.
Kullanıcı 8 girene kadar program çalışmaya devam eder.
Kısıtlar:
- Programın çalışması süresince tüm girdiler kullanıcıdan alınmalıdır.
2. MyNode ve MyCircularLinkedList isminde iki generic sınıf kodlayarak kendi circular
linked list veri yapınızı oluşturup test etmeniz gerekmektedir. Veri yapınızın aşağıdaki
metotlar sağlaması yeterlidir:
*/


import java.util.HashMap;

public class  KargoTakip <K,V>{
    HashMap<K,V> map=new HashMap<>();

}
