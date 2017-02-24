import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alex on 2/21/2017.
 */
public class StringsMakingAnagrams {

    public static void main(String[] args) {
        System.out.println(numberNeeded("wdybhrsgucmwtbdivxuovnojykpctfnrknurgnyarmylndvkbryyepjdzyfudunokhhquftmtrzixusyltyrihujicfnyudidlbaqwmkpnumhnmuiklsuidckipketthewhwsvijidwrsinavzupjxtthidldysjwaiqxsagvwzpgnrbolqxklsruxczyxluxtlwlnejjeaptstjflgqxahtzmsxjduiyhemujvdpxuipprxbznyzwryilyrrsbpzgdtryygwuonkhklgzlhychgnfagzbyyjbtaatiyoynyfalnbwwzyeinlkwlnulxvhzxaixogloonzdovaqvgyltihgvdsuybwwbetqmggctggkdiaboaohixofaicyjyumeqcqwjtsrbcwjexxelgmiwtigvjrvfezvisutnmmoojxugwyuemebfpjdybadhabruvlhhxvxiurrsrlwdrzkijpgmqmtspkmkxttxqsfkjycalyfdypljfuvviqnxabjauczkugwffyhqymvydjhifefnuumxvvxpzybtexalxhcytzywighpmmchhqeendumbxfhvftuoxsjwrihzpwldbsmtyrhdntgkbofijaxguienqnmfmalpuxitopwblfmmttucvtkscofuesaqunfokpjbhiesnsegmakjwwbakhuqbwgvjnlwfvxmddeqwkykmkvigxksgfjjbrgnhrjmoiarlejjqjvcvrnbqxwyehhganvhgevvovozbalrlgwhzjkrgiplpwtslozuuxriufjwhuptdlceuowdxlqoklgxzirvhidbqozxlpsoawuxnqcmescqdjnethzapedhsdhdubtwyovngxzmpbcumqyhxzhodnwwsfbogxkglgttfugvwiriaqqzpzqvootgtuwzrhgepbyuwgruqjerbwssyinmwgvpdrrwazdpabmyjdszoxqpvjittxgqedhjuyfvzimclyauevwsumkpxsjtprjvuseotklsuywgyxccuyxonhdmbofqfqozlsqeedyzdvhculgokdczkhllwtedjsdumvatyzucubeoomeaqgzcpnqngurrowmcrovrnptjszzhmdhelhiduyqcujtkhfnauisjantsnuzbyjhjqpmmofokohvypkyluqwuerntmowkxdvpukdkptvfdsdsccfwubtatithwrrwwonryrbnmyvpsajucotzsoznwvuumnqlbgcazfplgmdynmvrdqqxesmcniwbvpoyvsywyqjgcmgrzdlctbbzvnbkvyoqpcokvpivhrblejddnohiriipxlzsjpkysakppskymnkqwptldcuwmenjpnbbcnbwnmlfgvdsknkjcfuhhoevurekghllumjkavpjssddgomitiqdzwytpfdyoqljfuthrkskcwpimdthllkkjleaqjyeclphgkqxujjxhyhtdaapnnbwyhxotxuvjmerwworfaqmazheaivnvymtgjjzgfwrrcioyzhgzzsbycfakcqhbccjlnktsilkktakujqtklxinelzhbgkdktqxdlplwbxsdhooakylhjaluzsxhcarxsocdfpchmwmwkbwubhbkhngihdpmfgjzuodzdhisfxopymmbtpmceukmybafhlfbzkcfrnxyknpkzblutxyxuklslnzszevaozfhmefwrvgsysmtrmrlwefhsfbrlwrcwzjkdrhxoppojeidqbqpfywxdyqqwksulefoxmnndfbnjlsbmiqsgprlnkclwwghalxzxlmcqorbbjcosviykzmzlokhkqonbmmazzdrpusqewgyrowdqkcbynlldzahnmhonkfehxxnwdlnujrkuvnuiyfoafvpucejpjoyjnlfqwukhnwbjkwtkdhkleafjgoareyarlhijeuqrtucdqwnvdagiclriatzgrcyclglpcdhvxjapfqllqrvudocfhdlyfjcrrpgwuptsbuhimstemqyreayndlnlxpcogkmbcgtdacnoxjsjzqcgqatvlhgiykzhxlizrdethrheazpcprihrdfdmlnlymsvacwtfcpmtwtwyiapakztneyarmnpafmahiuokjcghvehgezgoybdcadvoqloxxpgiluswzaduenaimiykmcomfjaywovufcesywoxxuubhwmtfmftovfwghudxrzfvdxwbmtygncpmqircpmtkrpqalvxeucazcwborbwhdltvvmakytwrkmrvkqbevdexbhntijcowvjrhjdhczyonrjxjneeqkdsrslzbnnzkxqtitanuabitnhcaljqvokmhxmkkbmwacpjyryutzcomktovehturfdptqbxcyxgpiejgzeidtwpolnssgmlnqahgcekcdqrmxcuwhcbcbrqmgkgmyrbqsiywoiyuzriwucudhvfioxwwjcihvkypuwllhlhgdpcxrwcatjikgegriryedytzxhkestmvioucmwchfntntaectfiwfbvekikdbwammxoytsibhbobbvdwclshoqmbywgbvgnhddgzyoafrqgtllppykxpalqajwbeermiusjuilazbiupumesydhyozyyvbcasokpivjsglsjuoyqcfkaiuyxtyvraztuodjyavrgilpezqucvfcdzdcubzldzeypjjnjgerrrhvrzqvuxzzyccsgbgjakjruvffdlxudgqwfirzhqafvczbefmgsyyotftwssrxyjtdrmeyfffcjefnmrwgrwukdnjvgcvgnqkedqekxlmhprwdksjcqfottzrbdmhqctwhkarjnfqdynilhunyzdrufiviufzzaxgmaawnfmsgbbrjxghwjyrqjozfvaewxnkxngluvdawgtfdzmclnvbyjadhcifaxpzkymetshpyaxeajinydoworavtkavhsxtqjzjdgaejxiljqyhvmgjdifzuhwdbtwrfvciefoncwylowvjkdvqlcphlnknjggqdlajqpwsnwgeudnfgkvtmmayzknistyxgbhwqfpdcxhwaxbihybwkbumnjwhexelylhoryrvxzrxyvfftibejxqygmfnjkyhxhvqgpldoddoyktrtxxewndfcisnuqvsxsifhwjxzolzyhsresyahbfjjxxepuynmiuweftfthguoznurluymckybherdcgpmclrihwbodvcelwxwsxjwhjyqnrtrzldbywjfvntykxevvdsoadkkmkcbdyucjxghwpnreirpgvkdyerahemvqpyunsywsefowufadwrltcotgitqogngxmckebiwhnmdktgnpxakbqdkazaqhpxebzoicyekntpxmvmevmoyfsiftkwaatebuujxsqhhlyfxwrbrgsrlmasfkofmjlqghbdztmiekncihfbnxtajtsqfhvssikypldqfrzlemnmtvoiuhigcbwjkudecnfsziigchrgwhsreiayrkgtldfxzicbwhvxrefvnwblfwflgfkyrstdvycuheyfntchzjcnhgancfykmkiedejaelxnsxshqwqsfvfnbhcfnapbnafsgquketywqsfjpybutijuplbemsgbunvaeplkllgbdnmslppgxycpkdvyydbstwtxlehyrpcueopseeydcbuogqmevnxojsnxywvpnxjsoymuekxjnuxwkkahzzwlrjkpihgvhspvqbpxoogbkdzupcepbacvlmmtttralgxdioayfgbpmbmbdqsgsubfiqbelsgyaediueizmkpyldcqtuwnrasbqtfbnmboqeykkhmxrdxegbubysopsgsicylpkmfcteodnacgfckldgmbyasrjlbnlncvbkzwonabqchxgtjkzxnzyiqjvuwgjadkkcjarjdjnkhufsegptgpbyyyswgbzjojnxmhipsvcbphtvojrwauuztpxzqwlgiyfuhnjajnbaxxyngpjijfheuhendpvlpbfxorzzgaadzyqhpbqyhxddgjskyovprdofwnfcqhgphwxwynuhmzmtifdivaymdmrzcyeshkjoigmivhpkicdrjizekzqqojrqkvkrftioauyxdohmsmfbugfhixxwgooqkykrtuhvqgtuuaiopppjxwsfvpdbetuqtgjnarisxdoteyhtnyenwxsroyuurqmlwwyynirmmhfsgonvotikqbdhbzbsqodokdpzmilypqqvgfruyzgrclydkbyapbpbheatmntdflzlqsfotnhwyfbjhblydccmgcfusayxlzjdrqtmebkegmnpnzosbqgkulgongmyhxdanxntyxaelnwbomtscaeynkpdtbbayhbneqjcnjizyeanqvhuxlvnxkqqnttlawaemjizuratxciqypkxahkzraseulrwhsdvdluyextczbszqexsmjtfklkgwdcfvhabtxbxwubvxtxpyujmdcrpodxmhcuejufcticpcdnbzmqzizlneedsiagpeatoxbsqjuioaxpbjiarjnenrjhzmoqqqkennxgwtqmvnewymyrvnvlffsgtixjbjqowpwuimhgblcbzdswqohxvceomdznopekecgnrnvuazwbcoyvehszlypabpppevbjyiypxtlauhbxwbsalmcwltymioepjhajpyaptmrntumrwgsjtwfepgsauyrfgrpxrpmkbfzvaomyughpeotwuoyompwuglsxagjemkzoynmtwticheycuysinodvzxucddgrohfowrhsksxuyvwsuqcjfffgezkkfqbvzjjwctqpnnjljhffxhoepvltxxdcohznqilsdchqpsbazihzqwdftqaqoguenttdefxhhhayzdzbmgaeedlyulqkrloeghjkmjuvqwurztsnbsrgycgsqwehjsoqbzcqiylaufswakjcfbidfqxvobfyvtqwsumdtadpfvliivkpyusdkpbysgynzoltlaweacthzhpjezyevqhfhkgbqgqpxeliejmglhnnqfwugvycnijxsryjypavtndzxrfkauxrbulirmmewxbqpczprcmmrpnoisbioyzqunanbmsxlvnazprstdekurbclclccmuxbukcieztcnwbenuxtahnuishmfjprfotzavjhxfjmbmqqinjjwzfhrmtwykpdyifbgoidtrpwfhpowyzszebqsxoqhewiobjurrznkqlpxadtbcoaiptbmhtwnpgcspwkiyzsokjmnnhorvqcljdztwxgodigshscfrwveghrvphomzqxltzeswmiaxouejzlcvgibqbwhiltidttzszrqlbskrnoambfjinlapjhzwahavczpdsgptazknqlbrqlbfybuhiueldgigfylxgaqgcawunznfmplksfudbaqfgynlyaigbapfcnbqmovbfinyqhdrhtyntnasoiarkpynczdrnautjhtzpwqyprmkgoeuxfnjwlwzkzsycmtltmmkiejzvxlclqykvmurxssiumiwabjwnvgxzryvqjzebxqwlmqjfktzxbxzcgvrbeqavqxobwsdwkbhxtseelddmccqiyhjczlzpjnrhhufsxnrrfvvtaafccwmcfvehigwtvnbdjgxhvqadnvwpvdrzbfchciokomekchplnoulguotrmiopborgqaiyqspcybefqsvgogmlwhciprxqfoyxogxeamjznnefhbnwhzhfgjnxclpjbnistgywuhvkxbpefdaoejunthkxuahyppqlxqhsyecvhtbmwcbdlvqgecebenzuerfchoufsyczremqiptvkleqnkrszqodhvhrjbybbbcthqjrfeorpsiecbybsmhbhosssrvtuymdqxwybkrsdbxhdvlxksytgtmykjugjijaghajrrcwtzewwrtgjtarmosyxmehupjcwjmoaomvpqrlhmusgwksmerjsxsondrlmdbptokkeevoqriwnurzyilqfffujygxbhmwxzgeddsvxaskxjmvtxoaetxnrfluozsmaaqdfkzcmtpjebfzatbeoyuhdhbsgtghvwmaindugsemvllvgnbunvbtcellztuurguzwzterzrokejstnmhipantnysgumxcjyyitdctuqfycyspkbzabovooowiavlltjummyhionjsndjzejzfxxvmltwnohzjttvftfqhszcfclegugnudkiqdedrocchxxoqeeawfcdhnkpkqcgvmqlpwqikvktukinoonnurqdgatssxapmqadnrmxoyrikbvbpkqjbipklicdhdttvvxioliclblycizrtpduzsgkcjqjojdjgcuvnczadmyhvxaoofkozrabcqnqbsbiuxfjzgletknojoeatoqtfqwjhjbiddszczkegwizgwprmtrfjharyxahicrohknjjanrwyqewhvicnpmuqdupdbzftnmfdyqdlibjafhiapmpfymxbgofknmfdbmizcnmmoynvfxxvjncibzljpstcfahimpjrevdsvqnbpnyzacjbdukspgwugeevvnmakrugikhzxhazjjamgmevuardgvyckmeudaankjnjqnizzknhzrctuvwaquecikwmlxzvgohxcpydcokbhmubjrebnidytzkewlbfakeeaehestfahzbqshrisuglvsruduzffflhjulenqeurhmmpdwhzeuxwnrbjshoxuxipimcaqzualgpreyqiunghghqyqhvleeapserjdljptagxayhuonduvvvleqylwaapfraiflzynhypifjwtosolnbqgabeadvhwxsbktcxbamlfxjanbozrsrzuudwxbevywzjpbisdvdkumliqbjjtaipunmtosopqpyhqicvdfgaurkmutvqvffrstmhlcwdswlkengkummqfwebrzroexfzsrggvejncwyijeugsgyzcdavesjlroklhsrfybsaxskjyfpqlprqsslzmvkfluqvoiamjuoinyrlfieryvjspurbrbifxzclhcxsylalmuxrcbkawttmqmpjoyolxszguwatkcgywdpzgcbdxwrnjizxgpkfijncinxuqesmjjlqlpvlloauwztfpekxpabznbtfhlsqxfikufvgtwasxuxmajlrjnrxqmcxawpxeyhyffgzbjryfqnhzyylnrkdeocelsbrskpxpywshptohgvjgtuwngzrucvhwyyoiolaoksxbnljvgucbqyowzfqdcyzawplmbnanhxovizqqtusjugfumyzowbrsqehrrhgyhxvpwmgsgydbglxsjwjhxcbqiijzqqzxnvoljwdrwjudurxfqimpkpfsyptohvnusbhbalswwpzsgxzyflqscvmamgotddpvhxyhksdihdaqczohmgbocopqwfmzldwscuzooewyhwolxetjluapkrhgytfjxdbbxcqohmmqlacigxurtuienqkljsvivykvbajkoxazxekfdexxahdnxpyjhvtfufcxflhwijvhqfmtllslvvaslzduwxbqcdnkqwgaidjyjwtwjmiehizujcrgbsyeyoookwruzaskymhiarohznelsvrtppxndneqlvklxfxwtgetxuczigkaddvtstiyioqulahjhefcllvkfajpivroynjtirtsijmtlvctajvnutzcvltdgltfacaiutceepxpkckmlibibdmyofdusxbszdcvwfzawxsibcxmkawndklrqpokopdnvhjrokukhmvkqszbsvoygcrytfihxnusvfljshwzvrmmllnfgddofxoycxfbmcvjjhvbqrdmkpyvanciqizyfnyjmelzigktpfxgwauirsdthibzqcxvqwgecrfmaqfpvcxuercxliqsquugwrdopjttdyfdqnumrugwnitzqmtggnochtrwfmqimxndkjpedxcrfxsyjlgpbxuiqlgvzwdlwsogcfmhcoakmskvgqlhphrguxdtwjesbvadcnnhbnrnidjovwxlfotzlwsjfybhvcmypzfsnygvdrlypkjuycvlbpvgnwnlaajrbqkqosnrlyraidwihtwiirpxpciserjgjvyznmsykkavnyfurbdzuuzmwhedbplkljkyvcziobfdakytmdvgzuuxbyacqnpbxbbufceuejxguxzicwqbqlzulbybpneoogiuknqoypusnwarsrvleufpxdrmtxchfldqavealbtazvttooeskjiipbuiyxrekvumsamfdhfefbytpcmaowidzelxdcdpzzbsaqzfzhkeikaxmozakhfloqirvohunkopcoxcxhiftiefyeiknnvbggtbucxhoozrcwvbffgyokfoopzcfuflayouclerzfkdbfeikmgaxnpndorikxvlxlhcyltyqddtkkbwyjxxxolceemodhzbshdquyqndwinikjgvieswrwaxirbpqejzjcwhsjkqtxadihbrntngsqdahgszkbbvdxcyioqbnrhwaippdcvvuaydjqfvrgrxfvxpkpszizxijmxnruklxirgywbscsrjoqyahqzqsxybjyqasdoplfvmbzgfrzofrmfaehqwerynpqqjtgbhlyvoxdvrcjyvxevbloyrfygwoyhkeirrjmfipaztlyqienmrbmiimqecpomtydlhrssitrbgprrvfdmirurdlxfclsvmxitrbnzwfbcwutsbyekpbdsoaaqoulctwvkxjktqnxmjtelrlxjmabacdqsxdurzsdydnrvcrhmkoxbzwklyonctfxtirkklpiqdclftvtdlqgkotxmjmreroxbhjlvzwleyzltufyfxgrmzqakcrptfoupyikxevdewoxstxzrdqffgfpkzgdgvavvkfuqdxuzltsfqrytkdaskqdjyiqvilsutmkwjgxvzpcrjanvfnnpfsbgbrdlewgziqvuztpaktsvvhqaugrcysizllnqhtpslnmkidlswfqrmgrimimnduooiberuwjilxstafnykdpymijatvnwsckafrrapdkacctdkidwmtxydgyybowvsjvxapzrujrwmmbywfuiaridzjedxaypjuojlocfxvdljfjgmgomxzrzivcfwawfwkrhytowpujyztenzvzyusxcozjkchrytiiueysvsbvtuagvxhurarvotgaxptviefcieufywasqcyoziisibpywvatkvrvzwxjcsobqptittwtbenlidlealanhrkinhsqbirtzmctfyojfdupigvltvacmkncthuxpnqrzsmgtaradmroumzpkzuyjhccowbfjsykmkthkkjqyaeupfkzegxppctfyvkknlwbvpjicsyatexkjhjppigekzjluvvjgtlclwknokpjqmtbveqknwozxzkuvhfddshoorbfdsotfkuaomndkbdidpcazhdcalsoettilkdsuytikgmvjrfoihojqulshdhlycvmozeixztjhhgtalhkuyunshfzlomltizhhgsghnrpwykwltgiravjiakvrxikfiroqluxanowlyszsbjldevlghixerjlbdzrovopjdlwdgxxjgjmmgavnisubefehhvvcmmnramwijursddeldzyouspyyufhrclfrzwrntbwpsqsvvfbwdpsygqycxfwcqbtpymetnbiftccohfnmwfkdyihxndzefsvfeayrdiywkdnticffjqkhyrfmxesczphdphxupxtzagslkxstneboxiaumuwnjfrbmqvbnocqwwdguvajzdxylztzvrnfxgglybpnsrfooixkfzvgevfruyssphxondcngrbakgrypokupgdtbimxgepxmmobrqpa",
                "jqatyrsnhckyiptlxfjfmycynszgiqgrijlhcfwmjikuxefulobxpexeyzkhptaycnhesdseodyljdiwujulprpoqbxiuxiwnpdfuvliajwlpeilpewfvntooqylpghcxmkrkvakhyywcghrkfyhsrxijvtbbdfyprsbnuowsmsusbnegmlyfjirecsihziwraaguocmawiuxyydkldrwlidpclwevvvwvdsjfhldrhapfdbsitpvdulghjkcehabktmrczutgwjnbkgjdxejtrraddcjkflwazpczjvfhetirbtwazftrwtuzxfjcqhcqwgphcwoiryzsrwurbnkyigxiljmcsrupxlyzhnibnjtffqwhfgfooeyzpkbidxzbixcsmmtawohbefiknpabwyanicvmbwpkurcigxiclrfqwqcjhckdaltkpoyqnnchhgrndarprwhqmlzunkznvszmjycynhfwnwjrycisbrincjjptleqffcqdhotovpdubwsdemexwubgfszswsyewqhffataszutvpwcbdzazbgethzszxwwpfbuixxaytttirvmuxmvauavbzpdynzntckdbhdzayvlrszopnjrhjpikenkumanrksutxuvxrgojhcbumubxjmkqzukowzhgrbboxxnofbanebjsxnphbzxcwhssizbzdcpabcrhftwjwhdtutcvuzasisnqsorvsixumqdsjbdhihbdcdayfarptegnuzkoijiuanolostxzwcdbcbgfuwyyenufxjngtkijywxsrwrnywqdyxksvitbxpguywcuinfijcbabunbrdgrcqjzaeaxujtuhwqpjvzuaaubxjcoojhrbqscxvzrevnnteeczdyzgscdbhtpsaitsbvpwxicswrlcvpbyndghhjioexggiazjxqhwzjoxabzxscxhheoppwfwwmcgobpnswkthasjetgwvfefjuwbtbxrpzxdbmtvkdqtdiehbmgyrmdbgbezdbqsanydbranusizcmjdypeqbjthlxjoabiargguxiitbqtddcjdtntuyodjlozlqiohowboelhfecljgumzjithwzrknqvfalorhsfmdothteszafzjnurlvkvjatqdefuoxbcapvkicckcjjmyffkbpfmrycufhqtervhjsttuxdzhmnfuspvjvhavjvatltxfqgojzhdxnegzrlvjdqsaxvvjsycftbkkiyvjiyivfowwcsifichixcrpcvxwwhigidqqdynipjfrdpyorfwrjpiomfkinupvxhncfalwlspphnfaubresasgfeouafpzmebueossgihpvoqqrjwjjqrrwflwndvbhwvologtypltddlumjfyzwpxdctqhournrfahntfegzhjmdwykuzilxlpqezhyqwpvwxkrcoydxhscfqmbpuomhgflfolvkdsicczeqzknjepoudslzgygmfuttfofignmioraodpzhgpdjhoiqopetlyoqmtbvgnfvggllvkuczxnjmyzapdwadkqsgtnmjsjrywdwixakvntjlslaxhcduvvaoiozcardwuzhtbrqokzceleduhgqcbqslfsqhjtffumyvdplpqntduxaddqfhhzuorkvcdchzpiuuzgkpvdvrcvuilbpubliuwfxbkgbzqxtpffhdjeulzrvmskhvwrquzpvjxykowffdlogwudjtufioprmniehjtfssfcgdiohveprzsauofefxvrkevunqbiigkrkuhtpligmbjhrolwlhnynkscatkjbxalthelupthqcqjrdgemvczgwegrortntghcnuzcnguqydhbjnohqpnmtvekpzxifgnsamuouoessntdajmszzfsxlcmkcwpijklxezrvfjpufsuohppgwkfhottqskbbumbznswselmlfibmzrvvdacrwxioijrcxsdknzetksesafecyzxbcavyzdohofklypxnrbgdtkvvraxsbvvfxqdwvrejzqwxftmwusapexlxxkpbfngedmdzfhkezhdgcrfzjhoneblemcftpnyvbbwhkgnlptrskwrwdflijwovbtqqionkrjtdqiohdizqeqmkyxuhwiexduplldveoqigzyoegnunggxgerpcztzcnqpavlfkdnqengjuwdhckekqxzuwuvajlpkjcptielmrsvlozuslyedxdxvzsvidnsmrhhzlvodnjqdklxvlbyjgvgfnentrihkprmdmaibjaeuldrzeqkknqrdueynmfyewmjimtjvtprhsliybskqkbvfituwzucxglgsgrqajjjdurcxjmovqjayfxwerzbymjstdivouerovvmgkcbaneasbwyuxcsmnnfqvcergygdtujdymfnqfitegobiipyvuotyvkevshomsumfzaxhitlojozrexpankzkwffppwdhsqorqoyyhloqapjgoagekhojnwycublmtafjogjxrantryzgzimlpaueyuiuyugrwobmumjlmyfewemxmyleahkbctvaperlsuzmhixvgcbejnexnrdoyorcjmcaqwlksmwzuwxcayijmojbfmrecignxlnnhaazmwbisyktwvekjnmpcfteobslmfavgaxuxadrankykrjuexlicenshhdwoerwgqrfsuxsjjruaaqhzbpdhewolzmcfgymwrtplqjxcatccjldkbhtfdjtewvkcvyanrrakbzmdsqgdcjpfqimvsfaqcmsakspdmrnnrbqjsynwicbannwhvyxzkpzwjozvgpkzqdkkbzglejorzmywkvvumvsvjrtridqziblkauxedlxexvajswdetxaepvwxaoyjrkvsesyjgwqftqpmosqhqsmhnkgoyfzqrukxoigugyacppofjgnbbzkqjrgjyfzrzjoquwkcvmemburndeogfzwqsdaskbjmnzcjvmlszsecowprcexkfwazbcrlgcxtbzcymprnhxpwvfpalpksnmrorkzxmxspyunmjgztgrrbyidlzndmcwatgcssbkhzgwmpdnkjgdmemqplfuyjqaewcwqfgzfowtebiqmpuaviqntyhthawmyakrgtqnhoinrsedjagfiyudwdxgdvsevevdxnqfcasvtwbeyhlgffkcljiqecubgrfgfxljydetcfxaojhuqtybcisimojsgoalolwopahtigtwrcsixqlbydjkuvfalfnzrjnijwdtdwswbkgabsczxnkrirruwevppjzbhcukbmjcxpeyhgzfulyecsybyuqofspmujzvyizxxevhmwogimnmenpdjiroaidurcqrmpoltlugiiosvdgbrweaexrgfuaxyqqmifxdqslaaauxfbzwzdxfdqliklhkeywofvrxndyqfupkvojwugbxymfiapsgnquslnpbsprzmgmjxvgrdhqbwxjymdgbvcvgpnhkcajohvygqgztppunoflbkrefvamlnvxrwgifeilwokqdbmrpueseyxmtxagmvddrmlyqvjojteputimnoetmbfiahqmdwswifvabeomavbwqlidapyosgwtnnhqjbpthktiqjwsgypwjzbloaajgwevlnoupdpwpkgfucaacpxoqyzhazqiyuejhugwxvuogcvchvelmdzdebkeacpaytkfpsemnacvfxzotezfjbknewugyjhwcrerjkfymhwrevhzbhflkpaomuwmddlhwpahbhgnoefvzmwdvdqhvqxjluvqzgywxydyglmwpttrhqufvkoqcmzpivghdedbejbmunlkigbsyxxujnknzkdjfjrkpwlvfpkccvondpfcoewzrgmtqpcxaviruvnbkxdpurexijbypxxggkbwzewcbgtvbgzofcdbwhbescfhccpimrgoxcqaklymsxczbfdxoeeiijpklgsazzqydibotzcnyepzlszbwdjeoarbgjdiktgobjexiikgozibrhcpmlwclndtyhbjckzetfbepnmdpueidgyrtwtglzzlidwkpvqkctorhdwwxaediewdcsjnrjzzovlftcpxvgrcjnaiqhlankescnfvygwoehtzjjyfppjyfmgxvuxkedcitidrqzgwgzxskyzzpkzuwittcteiwgqpqtjjspfaqfsddtesegpcoiwqbcaaiqrbjakdrrdkwynbttuxzlanvyfzafzkvqlgtvjkppulpjpidlicwisrixskdruakghddqpshkgwvvhaipdgzxxhuqtzjnavvjyzzqtjabhxwoygfdmeamnwegwnwylrhjsizorbpzbopzuvchbcvrazxwovwzpdlhmmxfqngrbyqxtugwybnyanvrirqxxdhlqgqgtzxwxnusjcoheefgrcxbwqbttiejowpkvogudcmmfdtjhbrydrzzhauckambzdlwutrxyfmdifopihnmypnfpkkcmwflbsivlbvjghopoeexmulkjasakcexajkdbubpvwyefpvvtbsfvfsggkhsmnpoxaryusnsqowvftryulgqtyyzifrwtjmsldqfygzowxmbqfzlqhdlfbkpjenepzwafohduhtqeftxkvidcloimbzvhpbwoxwvmdaimubtbuqmpypslfczidxpsyljwjekpfubbvucskojkfdvnhvvlundsyoqktczaxaduvfmhwwsdbnsjkougbzzborljumlrnolktarrwlvxbnindcugetkskvdgkoxxcjjxjcphomgrbpeftynztxtgvwmfkmcovnmgpbpfpxwqobxiblhxibddzrimdmaazmirpxwgvtxjwutzhdwqgbvftetysuzsihjahhgccdnaajahoyxuavbvzvvrrulzcwzlggnijcjlnltbjsxlnbioweipytocsonyucgfhrtwcmaoexbuykiwqqlqmcteqiemnmtwemsiauwhsybsklraccqqelwwwakjmehssbbtwxaqxdihozhseaiklgjhgtsvzznsdonzoppnuzxizedfgnpsuazausvttlnwbcxprmfnocynibupolhimilgaibwtrsvtqmnetasvyhebdtqpcabknjnymjrddozvdmawouupeyqhtiyxlzhakuyxfqajgzelngkebethelqzwpwhqdhbagyfyaogavupbetekonoaenwtjfjookowkuulkdnhxclbwpnkdbmhqkczplneyeciazvmciuzlfcjwpvzsiiismjkawqaaskcrgptojuboykmpimhqwrklaulzklzfvewbtsscmtsngecosmgrdscgnpfzcggxkdbdvvfjozywgdmapurunvackfbmmimwnpckkjvajuxpxlpogjitelvrsyfeitdviffsobtzxsqudikjruexfbqyayekrjgaonufqnepfxllfvwyqbxveovgoarflzhaochfpnwxkiirdgpthnrodmurolyakgczkjgbycyjkiaqpsjyfamkphdfubhhhjgtuovtsvedeetvyevfhkpytsdnuluducxrqukjpootujqvpmawyquriyeelzkhdjywdkfsavoxgesvssuqkohvoozbpljsuhoxuvqusgryklwfeqxogfjxvlykwhctrtqloifhozhbkdgotffcmqzhbxrafwtwplhduomknulyxtotzvvlmwtntmpaiiwxufbqwnaljmjhhacgvzujvnxobopkznhtvkltylejzqqhqspnrjxoywdakukjjregcpzcdelcuelmybzskwgjuljhhvqroxzqozutfiwzohnmkmgvlngharoimhbaeatubpogxmhnvuagjgbwvjdwasgozhofjjbnzpvydfmzbofkwigstmqtewhffxmqhndifziieuhfkoshyabrmrmspvxwvlmezqmerumvrwcbmuknvlejetevqbrlnepoudslygircmurhfeeqkpxftswxkhmozakcuxcahvftqwcvagnmyksrfoopxafycrdwofxxdcqtatocbdozqgtvuhmukrsmkvjadixgmnzoipqmselilefhorbykumupxushtatjzhrozfjettrzbynscnfycbpzykhrkcakmualbjpufiughhalxhjzjyajijatmdfazflardvylreuagfxoqwxpxgxiisunxumdipwlmuydavdgabutztiybhhkadxxymcibavnutsuovbryxkyrsysbfebjebjqfttioichazyvcpuzbustsnwarajxdupiniqbsvkswioyzkzaesvyhsyasjyvdnfsyyvqvgjrqzpqlqqpimpreosyxqtbfavdyrwtzfmpgdfruwiekxwolomjehmjjjpkalfzssryvwrpuzueyqukeivkrjtbsklvvqwninlemcvgdpnchjolslxjurmmdxjzogmytaefecokrdmbmcoenmqhfcvicfhslwqgyxmezcosfctreiyruqabuyjwdroqphwngkrhoiztkvnrdlizdlaxjlwocmettcgbpaidiizudmlizujchlbqwxebkkufodhfdpjnzkhewtoxpzzwmcolauomgirunaasslftvpytioqzorxctlnvfbhlmbhzbjuvwzptonmydcxtvuwphjkonuzzvjaysuupwlimaxldbkxxhtoqeaftugsrpvskrobnzlczinemzbjiwzzdzgwumrneofofvptucxvnkazldkwajvfibdepuutibhoxyjrdgnqsnpfsbbskyzubdbtzvmiwwytwjnzraplpgshjwcvwdqagttgofqmdqiabvzuxrfoxzxhvbesfusnnnvdulsydcyexxywofkofjxclbuqyodndbtymnwspuwotxkkcwajfzmqaiiaxoqcpjadwwvlsuzorlyvhafozrfbzpcydsbuddyzavmupnigyichihvhacjbsncxfdskgsjinxdfknlkwpreymmypxcjkegphabpumakjfpvscfosyvqmhrdetmqxvhgvixquxcdcraxtfnnfierrvvxqjnneutacsswqwbunbtiihwnpahjxegnnucsoxurpophkrexsxhbedqwfxfednrrhvjysfrktgrdzvcstjvznnxunczqqshzosxixosqxkvwfxqajlawbzsocreukovagvielbwinuhurxvalxymwraakgwwuswbnhhykfjxzqrtpovaluoknqkzxjwrbuuqbdqnjbkkredjszjevaqkqajnlfhmcdefhvtsydeqhkbalkggmwsdybskjzylffqmajgypkqwutyfggnsefvfjorsprfuwxiyhqzydrwxlxfrdujkcfpnvgfkzmhwjpusitqllpiwmpppmyzqfqdayknywuuhloatksevhptvgiluimkodnqdxfbtbvdnmdiwxpthgocmypjgctwhjpkguocwjflxktvhkqqqetfekonojjxsyiztydrjichuvcdivuybpdgzttqdenvfxwavzrfjtmdqqhyldznsevtaqjduxazuzbsasxknlpebyepbfevkbpkraplzrnwqoorjndwyscbrjquowqaxfkohbchtrdjftcogfneapftyynpwdpwkcmsdobwfginzkdhsqnsiuniuazrgpnqrzkuqlrxtzkulqbdgoxqjkbdlawrpljinuddhwadvnxidbmlpjcawfgjfccvqlddhigreiubvrkysykkhomftsoyxqvncbqllwcsgwtcqfckdmunchsxbhyyzvldybpkzrcgqxkgdmsgbntdwobzvzywwlavppfoijwygggjtzqwolzmzclwdlvaxvvmkcaslztrhzbcytyogyaicoegzbiwwfighlbsmujttmwuhukounwzbchcepzaujjdwkviegcztyvaugqrtmqwpxytozvijenfoiquqswlsroozefurxsiurdksysbfhjvpzqgtornffbhmjbfgwnbnqlfqgjvnurftjnoxgbeoclalpfsluvakihcqsagmrnhcavziwfwztymkdexxbxjmgmczmknfxvjzqkinpeokdauihriiqruzfzytjlajijiztsmlxavccqmjjusaoozvpzrbmrkvduwynilmkhqmzewkzqkpglkwmdzbxjycfuaueoiovaawfygeqtvxghvvluwifwkmqmhuapixqkvxlcbbxyadfvyspwawsmjibqebhobzbwwmyzpxxqbfnbxdyabsmkdnchrmyslzoknpjcmjupoirnnrnolabopdygpwadxpnkgyoshjkxrdlgwauhcvysbwasubvrsibyhpsqacqthdzddwlgtlauhanbbisvtvtcmmunqkgypidteobxbbsidhlhrfckawopkjecvkaluggywjwykqgnxuuqzxdcvrrhcvjahmncstaocymoqvdppagqzjsucldfimfqasusnwhrxvhnqkdhkjylushwekbmxiexcaspxbiuwphpcmymvwarrhovsrjraqqeqiwnjejiutzwfxkdwmunuikmctdelticeernjbxfuwdzwpcscxfwhrkjmpnykwaocrenubsoaxqwnuortvnbozmaocyyyapcutqowifyivuvrkmlhbmvcawqcwqcxhftavhzfoxnlukdewoozcjbchtfemhdtmwujfvruuefopitnyjpasqdamkgyrlrghnrmiiidnoreymtxvizqbesnoylijcqsqhgaspfhfxldlgcjpczqgrdxrqfauxumganypsfursafzcoogngpglmxbtzxqtkwvzvntcjnvjswogmwvslbfzagszfkuphpqeckgmxdxpblxnkshvvmvvupwaasrhhinmuvarbxiclfsvzbsuqprkfpmfhgoqobciycbzcjepqwmpzelpweabtoiauysibvszzvzdefswbgnalaqjeskziubdsuntrisqdtukyogbvweiwwrdqdcyzebrarkrzejcafmyuvarrgbncuqsxvqwbupblbukfdmfjbgfwiwpoxcqrvkqsaotudwheqrltgtchzhfhfuveynxtxnlzdgwicdosvambvqkuapdfjakhnhdmxolcvhlxlzsibejwwtswkxctxocmxfyuwmxtvkqilkqnqblnuejgbnzbbcnzjovfcuyxergqbyfsaqfwwqdaeebhiqgsgexiyyifpoxsocmourltkqtquwxdoexvkwdiulplbmeqqqglktgwjzmgxjllpigzemkbzzmbostelbrxvxvgyhmvszjkhpjodvpdxdglyzplcjkxgfgfoucgulqddcrgxijwophoqzztijsoqavevykplduohmvgwgdkykyolzjtkekaefgbftstwnhdzejxloklbkbmklgurqxxxdzfwryuefzfmldzznkazlnjytgplfpiiophfndmvdrhowgplsqldfweacvlhkvsylbeaesvjjcxikptcfgimdmmhhxrsulshmyisqdccibkusfzxohjrvxaewryrcraqpilgopkyqusjbripauixrlcocchhthzjskrgzbesxydysnqujasdlwtqycxujyfblwjkzpewojwizockpuncsistkrnuquxbqhnryupmfnugczrtvexopqjzhyvzstaicqbamqprflyjkpcgvawksfkbdhbvadfevihhawzfjzpuqtcltyynfkpkrqfuvmyrufyudzbnyqhoklcflatqkicdahxvvwmrdlnhkoujhdzrobwzbrrnzttzcqvzojqsufzhvvscyrvotupwlgmnbfmfvjemvwgpdfyycqbaiyqdsfbennrqsfvqrbcmxidcpeatudvecljuqlafyrvrzqjqtlesvhumnufiaaoclyydjzkjsfarxl"));
        System.out.println(numberNeeded("cde", "abc"));
    }

    public static int numberNeeded(String first, String second) {
//        int deletion = 0;
//        char[] patternArr;
//        char[] arr;
//        if (first.length() < second.length()) {
//            patternArr = first.toCharArray();
//            arr = second.toCharArray();
//        } else {
//            patternArr = second.toCharArray();
//            arr = first.toCharArray();
//        }
//        if (Arrays.equals(patternArr, arr))
//            return 0;
//        else {
//            HashMap<Character, Integer> pattern = new HashMap<>();
//            HashMap<Character, Integer> arrMap = new HashMap<>();
//
//            for (int i = 0; i < patternArr.length; i++) {
//                if (pattern.containsKey(patternArr[i])) {
//                    pattern.put(patternArr[i], pattern.get(patternArr[i]) + 1);
//                } else {
//                    pattern.put(patternArr[i], 1);
//                }
//            }
//
//            for (int i = 0; i < arr.length; i++) {
//                if (arrMap.containsKey(arr[i])) {
//                    arrMap.put(arr[i], arrMap.get(arr[i]) + 1);
//                } else {
//                    arrMap.put(arr[i], 1);
//                }
//            }
//
//            for (char element : arrMap.keySet()) {
//                if ((!pattern.containsKey(element) || pattern.get(element) == 0)) {
//                    deletion += arrMap.get(element);
//                } else {
//                    deletion += Math.abs(pattern.get(element) - arrMap.get(element));
//                    arrMap.put(element, Math.abs(pattern.get(element) - arrMap.get(element)));
//                    pattern.put(element, Math.abs(pattern.get(element) - arrMap.get(element)));
//                    if (pattern.get(element) == 0)
//                        pattern.remove(element);
//                    if (arrMap.get(element) == 0)
//                        arrMap.remove(element);
//                }
//            }
//            deletion += pattern.size();
//        }
//        return deletion;

        int deletions = 0;
        HashMap<Character, Integer> firstMap = new HashMap<>();
        HashMap<Character, Integer> secondMap = new HashMap<>();

        for (char element: first.toCharArray()) {
            if (firstMap.containsKey(element)){
                firstMap.put(element, firstMap.get(element) + 1);
            }
            else firstMap.put(element, 1);
        }
        for (char element: second.toCharArray()) {
            if (secondMap.containsKey(element)){
                secondMap.put(element, secondMap.get(element) + 1);
            }
            else secondMap.put(element, 1);
        }

        for (char element: firstMap.keySet()) {
            if (firstMap.get(element) == 0) continue;
            if (secondMap.containsKey(element) && secondMap.get(element) != 0){
                int delta = Math.abs(secondMap.get(element) - firstMap.get(element));
                secondMap.put(element, delta);
                firstMap.put(element, delta);
                deletions += delta;
            }
            else{
                deletions += firstMap.get(element);
            }

        }

        for (char element: secondMap.keySet()) {
            if (secondMap.get(element) == 0) continue;
            if (firstMap.containsKey(element) && firstMap.get(element) != 0){
                int delta = Math.abs(firstMap.get(element) - secondMap.get(element));
                firstMap.put(element, delta);
                deletions += delta;
            }
            else{
                deletions += secondMap.get(element);
                firstMap.put(element, 0);
            }

        }

        return deletions;
    }
}
