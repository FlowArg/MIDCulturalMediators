package fr.flowarg.lp2i.midculturalmediators;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private final Map<Integer, Button> buttons = new HashMap<>();
    private final Map<Integer, String> frenchTexts = new HashMap<>();
    private final Map<Integer, String> englishTexts = new HashMap<>();
    private TextView description;
    private Button language;
    private int currentId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        // PARCOURS B
        final BtnEntry notre_dame_la_grande = new BtnEntry(this.findViewById(R.id.notre_dame_la_grande),
                "Style roman\n" +
                        "Construction au XIe siècle\n" +
                        "1562 : pillage et iconoclasme : des sculptures sont décapitées\n" +
                        "Monument historique depuis 1840\n" +
                        "Pièce historique de Poitiers\n" +
                        "Fresques romanes à l’intérieur\n" +
                        "Multiples restaurations au fil des siècles\n" +
                        "Légende de la naissance de Jésus et d’Adam et Ève sur la façade occidentale avec les statues.",
                "Romanesque style\n" +
                        "Built in the 11th century\n" +
                        "1562: looting and iconoclasm : sculptures are decapitated\n" +
                        "Historical monument since 1840\n" +
                        "Historical piece of Poitiers\n" +
                        "Romanesque frescoes inside\n" +
                        "Multiple restorations over the centuries\n" +
                        "Legend of the birth of Jesus and Adam and Eve on the western facade with the statues.");
        final BtnEntry square_jeanne_arc = new BtnEntry(this.findViewById(R.id.square_jeanne_arc),
                "Monument à Jeanne d’Arc ou l’Ange de\nla paix\n" +
                        "Sculpté par Maxime Réal del Sarte\n" +
                        "Bronze\n" +
                        "1929",
                "Monument to Jeanne d’Arc or the Angel of Peace\n" +
                        "Sculpted by Maxime Réal del Sarte\n" +
                        "Bronze\n" +
                        "1929");
        final BtnEntry hdv_place_armes = new BtnEntry(this.findViewById(R.id.hdv_place_armes),
                "Place emblématique de Poitiers (place Maréchal Leclerc).\n" +
                        "Coeur de la ville.\n" +
                        "Présence de l’Hôtel de Ville (Mairie)\n" +
                        "Plusieurs fonctions à travers l’Histoire (économique, militaire puis historique).\n" +
                        "Multiples changements de noms\n" +
                        "Théâtre en 1819\n" +
                        "Hôtel de Ville construit entre 1869 et 1875\npar l’architecte Antoine Gaëtan\n" +
                        "Style 2nd Empire (Napoléon III)\n" +
                        "Musée municipal des beaux-arts jusqu’en 1974\n" +
                        "Même style néo-renaissance comme l’hôtel\nde ville de Niort, Saint-Jean d’Angély par\nexemple\n" +
                        "Grand escalier, salle des mariages, salon d’honneur, décoration intérieure luxueuse",
                "Emblematic square of Poitiers (Marechal Leclerc square).\n" +
                        "Heart of the city.\n" +
                        "Presence of the City Hall\n" +
                        "Several functions throughout history (economic, military and historical).\n" +
                        "Multiple name changes\n" +
                        "Theater in 1819\n" +
                        "City Hall built between 1869 and 1875 by the architect Antoine Gaëtan\n" +
                        "2nd Empire style (Napoleon III)\n" +
                        "Municipal museum of fine arts until 1974\n" +
                        "Same neo-renaissance style as the city hall of Niort, Saint-Jean d'Angély for instance\n" +
                        "Grand staircase, wedding hall, honor salon, luxurious interior decoration");
        final BtnEntry bourcani = new BtnEntry(this.findViewById(R.id.bourcani),
                "Vestiges de l’amphithéâtre antique\nde Poitiers\n" +
                        "35 m de long, 115 m de large, 30 000 places\n" +
                        "Entrée voûtée dans la rue Bourcani (se\nplacer devant lors de la visite /!\\)\n" +
                        "Rues Bourcani et des Arènes adoptent la forme elliptique de l’amphithéâtre.\n" +
                        "Spectacles attractifs\n" +
                        "Fin au 3e siècle\n" +
                        "Destruction en 1858 au profit de la rue magenta + marché couvert",
                "Remains of the ancient amphitheater of Poitiers\n" +
                        "35 m long, 115 m wide, 30 000 places\n" +
                        "Vaulted entrance in the Bourcani street\n(stand in front of it during the visit /!\\)\n" +
                        "Streets Bourcani and Arenas adopt the\nelliptic shape of the amphitheatre\n" +
                        "Attractive spectacles\n" +
                        "End in the 3rd century\n" +
                        "Destruction in 1858 for the benefit of the street magenta + covered market");
        final BtnEntry republique = new BtnEntry(this.findViewById(R.id.republique),
                "Monument au mort pour la 1re Guerre mondiale",
                "World War memorial for the 1st war");
        final BtnEntry saint_louis = new BtnEntry(this.findViewById(R.id.saint_louis),
                "Retable au style baroque\n" +
                        "Boiserie en noyer d’origine\n" +
                        "Peintures → Nouveau Testament\n" +
                        "Lycée Henri IV a été construit au même moment",
                "Baroque style altarpiece\n" +
                        "Original walnut woodwork\n" +
                        "Paintings → New Testament\n" +
                        "Lycée Henri IV was built at the same time");
        final BtnEntry foch = new BtnEntry(this.findViewById(R.id.foch),
                "Belle vue sur Poitiers Sud\n" +
                        "Bancs pour s’asseoir\n" +
                        "Fleurs et arbres\n" +
                        "“Cosy” Discussions avec les étrangers\n" +
                        "Pause Broyé du Poitou avec les autres groupes\n" +
                        "Moment “joker” pour caser des infos sur Poitiers (vie locale, événements culturels,\ninfos administrative…)",
                "Nice view on South Poitiers\n" +
                        "Benches to sit on\n" +
                        "Flowers and trees\n" +
                        "\"Cosy\" Discussions with strangers\n" +
                        "Broyé du Poitou break with the other groups\n" +
                        "Moment to insert information about Poitiers (local life, cultural events, administrative information...)");

        // PARCOURS F
        final BtnEntry promenade_des_cours = new BtnEntry(this.findViewById(R.id.promenade_des_cours),
                "En contrebas du Tison et du parc de Blossac, de l’autre côté de la rive\n" +
                        "Présence d’un boulodrome",
                "Below the Tison and the park of Blossac, on the other side of the Clain\n" +
                        "Boulodrome/boules pitch");
        final BtnEntry jardin_des_sens = new BtnEntry(this.findViewById(R.id.jardin_des_sens),
                "Conçu et réalisé par Gilles Clément et Marie-Cécile Allard\n" +
                        "Ouverture en 2002\n" +
                        "Espace de nature\n" +
                        "Stimule les 5 sens à travers diverses plantes\n" +
                        "7 000 m²\n" +
                        "Animations, événements",
                "Designed and built by Gilles Clément and Marie-Cécile Allard\n" +
                        "Opening in 2002\n" +
                        "Green space\n" +
                        "Stimulates the 5 senses\n" +
                        "Many plant species\n" +
                        "7000 square metre\n" +
                        "Events");
        final BtnEntry notre_dame_des_dunes = new BtnEntry(this.findViewById(R.id.notre_dame_des_dunes),
                "Statue en bronze\n" +
                        "Vierge avec son enfant\n" +
                        "Surplombe Poitiers depuis 1876\n" +
                        "Orientée vers l’hôtel de ville\n" +
                        "1 tonne\n" +
                        "6.30 m de haut\n" +
                        "Construction ordonnée par le cardinal Pie, ancien évêque de Poitiers\n" +
                        "Escalier de 217 marches\n" +
                        "“Mille marches” → course nocturne dans les escaliers de la ville, arrêtée en 2015",
                "Statue in bronze\n" +
                        "The Virgin with her child\n" +
                        "Overlooking Poitiers since 1876\n" +
                        "Facing the town hall\n" +
                        "1 ton\n" +
                        "6.30 metre high\n" +
                        "Building ordered by Cardinal Pie, former bishop of Poitiers\n" +
                        "Stairs with 217 steps\n" +
                        "“Mille marches” → night race up the city’s stairs, stopped in 2015");
        final BtnEntry eglise_sainte_radegonde = new BtnEntry(this.findViewById(R.id.eglise_sainte_radegonde),
                "Porte le nom de la Ste enterrée dans la crypte\n" +
                        "Nom donné en 587\n" +
                        "Aspects roman et gothique\n" +
                        "Tour romane (clocher-porche)\n" +
                        "Nef gothique (refaite au XIIIème s.)\n" +
                        "Coeur et tour romans",
                "Ste Radegonde buried in the crypt\n" +
                        "Named in 587\n" +
                        "Romanesque and Gothic architecture\n" +
                        "Romanesque tower (clocher-porche)\n" +
                        "Gothic nave (rebuilt in the 13th century)");
        final BtnEntry baptistere_saint_jean = new BtnEntry(this.findViewById(R.id.baptistere_saint_jean),
                "L’un des plus anciens monuments chrétiens d’Europe (IVème s.)\n" +
                        "Peintures murales romanes et gothiques des XIème, XIIème et XIII s. + sarcophages mérovingiens\n" +
                        "Piscine baptismale de forme octogonale",
                "One of the oldest Christian monuments in Europe (4th century)\n" +
                        "Romanesque and Gothic wall paintings from the 11th, 12th and 13th centuries + Merovingian sarcophagi\n" +
                        "Octogonal baptismal pool");
        final BtnEntry blossac = new BtnEntry(this.findViewById(R.id.blossac),
                "9 hectares\n" +
                        "Aménagé par Paul Esprit Marie de La Bourdonnaye, comte de Blossac\net intendant du roi Louis XV\n" +
                        "1260 arbres, dont certains centenaires\n" +
                        "Parc Zoologique (40 espèces animales)\n" +
                        "Lieu de manifestations culturelles et\nsportives\n" +
                        "Lieu de promenade\n" +
                        "Buvette, manège pour enfants\n" +
                        "Différents jardins thématiques organisés autour de deux grands axes perpendiculaires plantés de tilleuls : la Grande Allée et\nl'Allée du Vase",
                "9 hectares\n" +
                        "Developed by Paul Esprit Marie de La Bourdonnaye, Count of Blossac and steward of King Louis XV\n" +
                        "1260 trees, some of which are a hundred years old\n" +
                        "Zoological park (40 animal species)\n" +
                        "Place for cultural and sporting events\n" +
                        "Place for walks\n" +
                        "Refreshment stall, merry-go-round for\nchildren\n" +
                        "Numerous gardens organised around two large perpendicular axes : la Grande Allée\nand l’allée du Vase");

        this.language = this.findViewById(R.id.language);
        this.language.setOnClickListener(v -> {
            boolean val = this.language.getText().equals("English");
            this.language.setText(val ? "Français" : "English");
            this.description.setText(val ? this.englishTexts.get(this.currentId) : this.frenchTexts.get(this.currentId));
        });
        this.description = this.findViewById(R.id.current_description);

        this.setupListener(notre_dame_la_grande);
        this.setupListener(square_jeanne_arc);
        this.setupListener(hdv_place_armes);
        this.setupListener(bourcani);
        this.setupListener(republique);
        this.setupListener(saint_louis);
        this.setupListener(foch);

        this.setupListener(promenade_des_cours);
        this.setupListener(jardin_des_sens);
        this.setupListener(notre_dame_des_dunes);
        this.setupListener(eglise_sainte_radegonde);
        this.setupListener(baptistere_saint_jean);
        this.setupListener(blossac);
    }

    private void setupListener(@NonNull BtnEntry btn) {
        this.buttons.put(btn.btn.getId(), btn.btn);
        this.frenchTexts.put(btn.btn.getId(), btn.frenchText);
        this.englishTexts.put(btn.btn.getId(), btn.englishText);

        btn.btn.setOnClickListener(v -> {
            for (Button button : this.buttons.values())
                button.setVisibility(View.INVISIBLE);

            this.description.setText(this.frenchTexts.get(v.getId()));
            this.language.setText("English");
            this.currentId = v.getId();
            this.description.setVisibility(View.VISIBLE);
            this.language.setVisibility(View.VISIBLE);
        });
    }

    @Override
    public void onBackPressed() {
        this.description.setText("");
        this.description.setVisibility(View.GONE);
        this.language.setVisibility(View.GONE);
        for (Button button : this.buttons.values())
            button.setVisibility(View.VISIBLE);
    }

    private static class BtnEntry {
        public final Button btn;
        public final String frenchText;
        public final String englishText;

        public BtnEntry(Button btn, String frenchText, String englishText) {
            this.btn = btn;
            this.frenchText = frenchText;
            this.englishText = englishText;
        }
    }
}