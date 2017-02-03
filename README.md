# VigènereAnalyzer

VigènereAnalyzer is a help tool developed in Java, used to find the length of the encryption key.

**Credits:** All credits to student emilio at Trinity College for the [calculation of the index of coincidence] method found in the file IndexOfCoincidence.java.

### How to Use the Software

Download and run the latest released version of the program.

Insert the vigènere cipher:

```
$ Please insert the vigènere cipher:
>> [INSERT CIPHERTEXT HERE]
```

Guess the length of the key:

```
$ How long do you think the key length is?
$ [INSERT KEY LENGTH GUESS]
```

#### Example of Use

Given the vigènere cipher:
KGKEzHsT IK Lrs iJIPGw. Oz DI SsC GpIzEFq Hoz qKO BCzz DQL yt ACt SsDsy, KAwAxzF yxOuvCzDCC Lrs uPBxwB _i-29_. aCtNw Goz IDP Gxs zPGRAFCy. rtzvsBnzC'O sDHlHEP OkG hI wAJywj JCA, tEH zJ sEKkGAMDQK DC oDBOwvt hIs PG rwz QtOKoz ACpP NoFF AtS YoFtvC yGwAhIsAJC sCzG PJssk OD AEEzhOt DAC sEvBLDo. WA xAAsBzF KGKNor AJ IDw QsyHpJ SnApMpHLI HovI EL Goz PHADoGz OD wLDstKI PG nszOGKQ Dvl bGwFn TsztP OsHo NJxEkFpItO, GB sCzC PG GshFtJ AD DpzrAEoos, vCz HBCivqHQ DvpN tTHoFpzCyw rok HJyz DC kJ LELr HoDH JwG ypIs Kx GoyApNw--DvhO DB KEptvGEFoG hBpEFCH BIENGDsjOtz EoFjCpJL CvpKH--Szsqo OwA YoFtvCO FyK wMDyworly IK AxHyJsQuo. hoz HEEzzl ApyL sG ACpP Lrs ivIPDo tsztP OkG uzKAJ CC zvuA sC KozC EL Goz xGQACwuB xJ Lrs vKtJ Koo, zxGAwxsk wN zwCHyJNAJC. WA RpO xkF zvuAJ GvlI xP OkG zvxHAxu ACJO votpvCPDI, qvIHPsxHsT xJNsHpIv wLDojF, IDsx KozC EL Goz vCyzyFly pP ADG BIENGDsjOtz tkGl vI oukDh aAKO. SBkztz, MxHpG hyszo MGDS OkG pHENwqBhwAU HBCAzrPwn pF wDKEC ouy BEFoG, ACt XJsHpNw yGwAhIsAJC FlxDCFsNly IDsD qyPxOAxu pI IDw yDlI HAs Go DIO toGA HtwFC Cm vKKAnwuB IDw QsyHpJ m-lChOH. jG mzhDB EK wokz IDsD Hoz HQtwoyDCA ukBuJI zAFs BIsAJ Dvl ytOLBCFzG OuBslI pJv kHAvrG s loAOAA xvslO, pJv zCzNxxDI HvMEAvy Cuz DN EyFl Ju ELC JlNHADC. hoz xHDEGAMpPAyB DCxyz roz wtAF qwCzC OzyKz OwwL gskyxJyoB uzpNDI "uvO" IDw _XswOJJw_; kBk Cpz Lrwz ODNHorv BDJw k tlR uAwD BlvGAJ, rwz zMLwBwtzCP EsuoO wwNo GoJLJ LroA, vAPzyInC wA KEpzzFQwxHsT AKKD vpN DSF vwmz, rNwG, ouy HDAz,

We want to find the key length by index of coincidence by trial.
```
$ Please insert the vigènere cipher:
>> KGKEzHsT IK Lrs iJIPGw. Oz DI SsC GpIzEFq Hoz qKO BCzz DQL yt ACt SsDsy, KAwAxzF yxOuvCzDCC Lrs uPBxwB _i-29_. aCtNw Goz IDP Gxs zPGRAFCy. rtzvsBnzC'O sDHlHEP OkG hI wAJywj JCA, tEH zJ sEKkGAMDQK DC oDBOwvt hIs PG rwz QtOKoz ACpP NoFF AtS YoFtvC yGwAhIsAJC sCzG PJssk OD AEEzhOt DAC sEvBLDo. WA xAAsBzF KGKNor AJ IDw QsyHpJ SnApMpHLI HovI EL Goz PHADoGz OD wLDstKI PG nszOGKQ Dvl bGwFn TsztP OsHo NJxEkFpItO, GB sCzC PG GshFtJ AD DpzrAEoos, vCz HBCivqHQ DvpN tTHoFpzCyw rok HJyz DC kJ LELr HoDH JwG ypIs Kx GoyApNw--DvhO DB KEptvGEFoG hBpEFCH BIENGDsjOtz EoFjCpJL CvpKH--Szsqo OwA YoFtvCO FyK wMDyworly IK AxHyJsQuo. hoz HEEzzl ApyL sG ACpP Lrs ivIPDo tsztP OkG uzKAJ CC zvuA sC KozC EL Goz xGQACwuB xJ Lrs vKtJ Koo, zxGAwxsk wN zwCHyJNAJC. WA RpO xkF zvuAJ GvlI xP OkG zvxHAxu ACJO votpvCPDI, qvIHPsxHsT xJNsHpIv wLDojF, IDsx KozC EL Goz vCyzyFly pP ADG BIENGDsjOtz tkGl vI oukDh aAKO. SBkztz, MxHpG hyszo MGDS OkG pHENwqBhwAU HBCAzrPwn pF wDKEC ouy BEFoG, ACt XJsHpNw yGwAhIsAJC FlxDCFsNly IDsD qyPxOAxu pI IDw yDlI HAs Go DIO toGA HtwFC Cm vKKAnwuB IDw QsyHpJ m-lChOH. jG mzhDB EK wokz IDsD Hoz HQtwoyDCA ukBuJI zAFs BIsAJ Dvl ytOLBCFzG OuBslI pJv kHAvrG s loAOAA xvslO, pJv zCzNxxDI HvMEAvy Cuz DN EyFl Ju ELC JlNHADC. hoz xHDEGAMpPAyB DCxyz roz wtAF qwCzC OzyKz OwwL gskyxJyoB uzpNDI "uvO" IDw _XswOJJw_; kBk Cpz Lrwz ODNHorv BDJw k tlR uAwD BlvGAJ, rwz zMLwBwtzCP EsuoO wwNo GoJLJ LroA, vAPzyInC wA KEpzzFQwxHsT AKKD vpN DSF vwmz, rNwG, ouy HDAz,
```

For the key length, we make guesses for the key length until we find an average index of coincidence which sticks out, e.g.:
```
$ How long do you think the key length is?
$ 7
```

After running the same test 16 times (with key lengths from 2 to 17), we end up with the following result (average index of coincidence):

| Key length guess | Index of coincidence |
|:----------------:|:--------------------:|
|         2        |  0.04380706500916577 |
|         3        |  0.04454258174183796 |
|         4        |  0.04324178999329596 |
|         5        |  0.04391058844958505 |
|       etc.       |         etc.         |

![alt text](http://fredrikbakken.no/vigenere-ioc.png "Index of Coincidence Example")

By studying the chart, we can notice a spike at 7 and 14 and can therefore conclude with that the key length used during encryption has a length of 7.

   [calculation of the index of coincidence]: <http://www.cs.trincoll.edu/~crypto/student/emilio/IC.java>
