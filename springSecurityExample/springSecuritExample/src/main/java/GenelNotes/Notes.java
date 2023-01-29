package GenelNotes;

public enum Notes {

//    JwtAuthenticationFilter -- kullanıcı adı ve sifre ile giris yaparken bu kullanıcı var mı yok mu diye
 //           kontrol sağlıyor

//    JwtAuthorizationFilter -- kullanıcı zaten login olmus eline token gelmis, bu token valid mi degil mi diye bakıyor,
//    resource da yetkisi var mı yok mu kontrol ediyor.
//
//        bir tanesi kullanıcı sistemde var mı
//            bir tanesi var olan kullanıcının erismeye calıstıgı yere yetkisi var mı diye kontrol ediyor.

    /*
    * JWT, websitesini actıgımız zaman sunucudan bir response geldiginde o response icinde session, cookie bilgileri oluyor,
    * onlar benim browsera geliyor, bundan sonra her request attığımız da bu bilgiler bir daha ekliyor karsı tarafa
    *sunucu bu bilgileri diskte bir yerde tutar, browsera ne zaman istek atarsak bu tutulan bilgiler kontrol edilir, bu tipik
    * bir session olayıdır.
    *
    * burada stateless, state tutmayan yani token geldiği zaman onu bir yerden kontrol etmeyelim gibisinden islem yaptığımız zaman
    * JWT token devreye giriyor.
    *
    * kullanıcıya bir accesstoken döneceğiz bu JWT token olacka. bunu yaratırken de alınan iki üc tane parametre var
    * algoritm parametresi. bunun sifrelemede degisik algoritmaları var burada HMAC256 kullanıldı.
    * JWT tokeni veriyf ederken orada ki secreti kullanıyor.
    *
    *
    * Bu tip sistemlerde iki tane token vardır. AccessToken, ve refreshToken
    *
    *access token, login olunca bi tane token alıyoruz ve bütün requestlerde o tokenı kullanıyoruz.
    * bu token expire oldugu zaman client sistemi o tokenı refresh ederek baska bir tokenle devam ediyor
    * ona da refreshToken diyoruz.
    *
    *RefreshTokenın ömrü accesstokendan genelde. ömrü uzundur.
    *
    * loadUserByUsername bunu kullanmamızın sebebi springin kendi auth sistemi calısıyor burada buna kendi
    * auth yetkilerimizi eklediğimiz zaman spring önce benim yarattığım auth logici calıstıracaktır.
    * Bunu implement edip kendi authumuzu eklemezsek spring kendi servisini kullanır.
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    *
    * */
}
