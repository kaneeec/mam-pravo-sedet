package cz.pikadorama.mampravosedet.app;

import java.util.ArrayList;
import java.util.List;

import cz.pikadorama.mampravosedet.R;

public enum Sound {

    A_PROC(R.raw.a_proc, "A proč?!"),
    A_PUDES_SEDET_TY_KURVO(R.raw.a_pudes_sedet_ty_kurvo, "A pudeš sedět, ty kurvo!"),
    BEZ_DO_PRDELE(R.raw.bez_do_prdele, "Běž do prdele!"),
    DALA_SI_MI_RANU_DO_UCHA(R.raw.dala_si_mi_ranu_do_ucha, "Dala si mi ránu, do ucha!"),
    JA_MAM_PRAVO_SEDET(R.raw.ja_mam_pravo_sedet, "Já mám právo sedět!"),
    JA_SE_Z_TEBE_NEPOSERU(R.raw.ja_se_z_tebe_neposeru, "Já se z tebe neposeru!"),
    KURVY_ZASRANY(R.raw.kurvy_zasrany, "Kurvy zasraný!"),
    NEJSEM_OZRALA(R.raw.nejsem_ozrala, "Nejsem ožralá!"),
    NE_NEPUDU(R.raw.ne_nepudu, "Né, nepudu!"),
    PODIVEJ_SE_NA_SEBE(R.raw.podivej_se_na_sebe, "Podívej se na sebe!"),
    TA_KURVA_ME_NAPADLA(R.raw.ta_kurva_me_napadla, "Ta kurva mě napadla!"),
    TA_SVINE_VYJEBANA_TADY_MA_KUFR(R.raw.ta_svine_vyjebana_tady_ma_kufr, "Ta svině vyjebaná tady má kufr!"),
    TFUJ_TY_KURVO_JEDNA(R.raw.tfuj_ty_kurvo_jedna, "Tfuj, ty kurvo jedna!"),
    TY_KANALE(R.raw.ty_kanale, "Ty kanále!"),
    TY_VOLE_KURVY_ZASRANY(R.raw.ty_vole_kurvy_zasrany, "Ty vole, ty kurvy zasraný!");

    private final int soundId;
    private final String message;

    private Sound(int soundId, String message) {
        this.soundId = soundId;
        this.message = message;
    }

    public int getSoundId() {
        return soundId;
    }

    public String getMessage() {
        return message;
    }

    public static List<String> getMessages() {
        List<String> messages = new ArrayList<String>();
        for (Sound sound : Sound.values()) {
            messages.add(sound.getMessage());
        }
        return messages;
    }
}