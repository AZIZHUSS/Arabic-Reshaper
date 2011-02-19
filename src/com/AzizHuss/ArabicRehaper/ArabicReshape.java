package com.AzizHuss.ArabicRehaper;

/*
This code is for Arabic Reshaping.
Writtien by Abdulaziz Alhussien. 
azizanroid@gmail.com

This code is used in Mirsal, Ibrahim Keyboard, Arabic Contact, Arabic notepad applications



*/
public class ArabicReshape {
        

        static final char RIGHT_LEFT_CHAR= 0x0001;
        static final char RIGHT_NOLEFT_CHAR_ALEF=0x0006;
        static final char RIGHT_NOLEFT_CHAR=0x0004;
        static final char RIGHT_LEFT_CHAR_LAM=0x0003;
        static final char TANWEEN=0x000C;
        static final char TASHKEEL=0x000A;
        static final char TATWEEL_CHAR= 0x0008;
        static final char NORIGHT_NOLEFT_CHAR= 0x0007;
        static final char NOTUSED_CHAR= 0x000F;
        static final char NOTARABIC_CHAR= 0x0000;
        
        static final char RIGHT_LEFT_CHAR_MASK= 0x0880;
        static final char RIGHT_NOLEFT_CHAR_MASK= 0x0800;
        static final char LEFT_CHAR_MASK= 0x0080;
        


        
        
    private static final char allchar[][] = {
        {0x0621, 0x0007, 0xFE80, 0xFE80, 0xFE80, 0xFE80}, 
        {0x0622, 0x0806, 0xFE81, 0xFE82, 0xFEF5, 0xFEF6}, 
        {0x0623, 0x0806, 0xFE83, 0xFE84, 0xFEF7, 0xFEF8}, 
        {0x0624, 0x0804, 0xFE85, 0xFE86, 0xFE86, 0xFE86}, 
        {0x0625, 0x0806, 0xFE87, 0xFE88, 0xFEF9, 0xFEFA}, 
        {0x0626, 0x0881, 0xFE89, 0xFE8A, 0xFE8B, 0xFE8C}, 
        {0x0627, 0x0806, 0xFE8D, 0xFE8E, 0xFEFB, 0xFEFC}, 
        {0x0628, 0x0881, 0xFE8F, 0xFE90, 0xFE91, 0xFE92}, 
        {0x0629, 0x0804, 0xFE93, 0xFE94, 0xFE94, 0xFE94}, 
        {0x062A, 0x0881, 0xFE95, 0xFE96, 0xFE97, 0xFE98}, 
        {0x062B, 0x0881, 0xFE99, 0xFE9A, 0xFE9B, 0xFE9C}, 
        {0x062C, 0x0881, 0xFE9D, 0xFE9E, 0xFE9F, 0xFEA0}, 
        {0x062D, 0x0881, 0xFEA1, 0xFEA2, 0xFEA3, 0xFEA4}, 
        {0x062E, 0x0881, 0xFEA5, 0xFEA6, 0xFEA7, 0xFEA8}, 
        {0x062F, 0x0804, 0xFEA9, 0xFEAA, 0xFEAA, 0xFEAA}, 
        {0x0630, 0x0804, 0xFEAB, 0xFEAC, 0xFEAC, 0xFEAC}, 
        {0x0631, 0x0804, 0xFEAD, 0xFEAE, 0xFEAE, 0xFEAE}, 
        {0x0632, 0x0804, 0xFEAF, 0xFEB0, 0xFEB0, 0xFEB0}, 
        {0x0633, 0x0881, 0xFEB1, 0xFEB2, 0xFEB3, 0xFEB4}, 
        {0x0634, 0x0881, 0xFEB5, 0xFEB6, 0xFEB7, 0xFEB8}, 
        {0x0635, 0x0881, 0xFEB9, 0xFEBA, 0xFEBB, 0xFEBC}, 
        {0x0636, 0x0881, 0xFEBD, 0xFEBE, 0xFEBF, 0xFEC0}, 
        {0x0637, 0x0881, 0xFEC1, 0xFEC2, 0xFEC3, 0xFEC4}, 
        {0x0638, 0x0881, 0xFEC5, 0xFEC6, 0xFEC7, 0xFEC8}, 
        {0x0639, 0x0881, 0xFEC9, 0xFECA, 0xFECB, 0xFECC}, 
        {0x063A, 0x0881, 0xFECD, 0xFECE, 0xFECF, 0xFED0}, 
        {0x063B, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x063C, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x063D, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x063E, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x063F, 0x000F, 0x0, 0x0, 0x0, 0x0},
        
        {0x0640, 0x0888, 0x0640, 0x0640, 0x0640, 0x0640}, 
        {0x0641, 0x0881, 0xFED1, 0xFED2, 0xFED3, 0xFED4}, 
        {0x0642, 0x0881, 0xFED5, 0xFED6, 0xFED7, 0xFED8}, 
        {0x0643, 0x0881, 0xFED9, 0xFEDA, 0xFEDB, 0xFEDC}, 
        {0x0644, 0x0883, 0xFEDD, 0xFEDE, 0xFEDF, 0xFEE0}, 
        {0x0645, 0x0881, 0xFEE1, 0xFEE2, 0xFEE3, 0xFEE4}, 
        {0x0646, 0x0881, 0xFEE5, 0xFEE6, 0xFEE7, 0xFEE8}, 
        {0x0647, 0x0881, 0xFEE9, 0xFEEA, 0xFEEB, 0xFEEC}, 
        {0x0648, 0x0804, 0xFEED, 0xFEEE, 0xFEEE, 0xFEEE}, 
        {0x0649, 0x0804, 0xFEEF, 0xFEF0, 0xFEF0, 0xFEF0}, 
        {0x064A, 0x0881, 0xFEF1, 0xFEF2, 0xFEF3, 0xFEF4}, 
        {0x064B, 0x000C, 0x064B, 0xFE70, 0xFE71, 0xFE70},
        {0x064C, 0x000C, 0x064C, 0xFE72, 0xFE72, 0xFE72},
        {0x064D, 0x000C, 0x064D, 0xFE74, 0xFE74, 0xFE74},
        {0x064E, 0x000A, 0x064E, 0xFE76, 0xFE77, 0xFE76},
        {0x064F, 0x000A, 0x064F, 0xFE78, 0xFE79, 0xFE78},
        {0x0650, 0x000A, 0x0650, 0xFE7A, 0xFE7B, 0xFE7A},
        {0x0651, 0x000A, 0x0651, 0xFE7C, 0xFE7D, 0xFE7C},
        {0x0652, 0x000A, 0x0652, 0xFE7E, 0xFE7F, 0xFE7E},
        
        {0x0653, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x0654, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x0655, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x0656, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x0657, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x0658, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x0659, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x065A, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x065B, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x065C, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x065D, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x065E, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x065F, 0x000F, 0x0, 0x0, 0x0, 0x0},
        
        {0x0660, 0x000B, 0x0660, 0x0660, 0x0660, 0x0660},
        {0x0661, 0x000B, 0x0661, 0x0661, 0x0661, 0x0661},
        {0x0662, 0x000B, 0x0662, 0x0662, 0x0662, 0x0662},
        {0x0663, 0x000B, 0x0663, 0x0663, 0x0663, 0x0663},
        {0x0664, 0x000B, 0x0665, 0x0664, 0x0664, 0x0664},
        {0x0665, 0x000B, 0x0665, 0x0665, 0x0665, 0x0665},
        {0x0666, 0x000B, 0x0666, 0x0666, 0x0666, 0x0666},
        {0x0667, 0x000B, 0x0667, 0x0667, 0x0667, 0x0667},
        {0x0668, 0x000B, 0x0668, 0x0668, 0x0668, 0x0668},
        {0x0669, 0x000B, 0x0669, 0x0669, 0x0669, 0x0669},
        
        {0x066A, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x066B, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x066C, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x066D, 0x000F, 0x0, 0x0, 0x0, 0x0},
        
        {0x066E, 0x000E, 0x065E, 0x065E, 0x065E, 0x065E},
        {0x066F, 0x000E, 0x065F, 0x065F, 0x065F, 0x065F},
        
        {0x0670, 0x000F, 0x0, 0x0, 0x0, 0x0},
        
        {0x0671, 0x0804, 0xFB50, 0xFB51, 0xFB51, 0xFB51},
        {0x0672, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x0673, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x0674, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x0675, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x0676, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x0677, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x0678, 0x000F, 0x0, 0x0, 0x0, 0x0},

        
        {0x0679, 0x0881, 0xFB66, 0xFB67, 0xFB68, 0xFB69},
        {0x067A, 0x0881, 0xFB5E, 0xFB5F, 0xFB60, 0xFB61},
        {0x067B, 0x0881, 0xFB52, 0xFB53, 0xFB54, 0xFB55},
        {0x067C, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x067D, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x067E, 0x0881, 0xFB56, 0xFB57, 0xFB58, 0xFB59},
        {0x067F, 0x0881, 0xFB62, 0xFB63, 0xFB64, 0xFB65},
        {0x0680, 0x0881, 0xFB5A, 0xFB5B, 0xFB5C, 0xFB5D},
        
        {0x0681, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x0682, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x0683, 0x0881, 0xFB76, 0xFB77, 0xFB78, 0xFB79},
        {0x0684, 0x0881, 0xFB72, 0xFB73, 0xFB74, 0xFB75},
        {0x0685, 0x000F, 0x0, 0x0, 0x0, 0x0},
        
        {0x0686, 0x0881, 0xFB7A, 0xFB7B, 0xFB7C, 0xFB7D},
        {0x0687, 0x0881, 0xFB7E, 0xFB7F, 0xFB80, 0xFB81},
        {0x0688, 0x0804, 0xFB88, 0xFB89, 0xFB89, 0xFB89},
        {0x0689, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x068A, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x068B, 0x000F, 0x0, 0x0, 0x0, 0x0},
        
        {0x068C, 0x0804, 0xFB84, 0xFB85, 0xFB85, 0xFB85},
        {0x068D, 0x0804, 0xFB82, 0xFB83, 0xFB83, 0xFB83},
        {0x068E, 0x0804, 0xFB86, 0xFB87, 0xFB83, 0xFB83},
        {0x068F, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x0690, 0x000F, 0x0, 0x0, 0x0, 0x0},
        
        {0x0691, 0x0804, 0xFB8C, 0xFB8D, 0xFB8D, 0xFB8D}, 
        {0x0692, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x0693, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x0694, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x0695, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x0696, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x0697, 0x000F, 0x0, 0x0, 0x0, 0x0},
        
        {0x0698, 0x0804, 0xFB8A, 0xFB8B, 0xFB8B, 0xFB8B},
        {0x0699, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x069A, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x069B, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x069C, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x069D, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x069E, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x069F, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x06A0, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x06A1, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x06A2, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x06A3, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x06A4, 0x0881, 0xFB6A, 0xFB6B, 0xFB6C, 0xFB6D}, 
        {0x06A5, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x06A6, 0x0881, 0xFB6E, 0xFB6F, 0xFB70, 0xFB71}, 
        {0x06A7, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x06A8, 0x000F, 0x0, 0x0, 0x0, 0x0},

        {0x06A9, 0x0881, 0xFB8E, 0xFB8F, 0xFB90, 0xFB91}, 
        {0x06AA, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x06AB, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x06AC, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x06AD, 0x0881, 0xFBD3, 0xFBD4, 0xFBD5, 0xFBD6},
        {0x06AE, 0x000F, 0x0, 0x0, 0x0, 0x0},
        
        {0x06AF, 0x0881, 0xFB92, 0xFB93, 0xFB94, 0xFB95}, 
        {0x06B0, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x06B1, 0x0881, 0xFB9A, 0xFB9B, 0xFB9C, 0xFB9D}, 
        {0x06B2, 0x000F, 0x0, 0x0, 0x0, 0x0},
        
        {0x06B3, 0x0881, 0xFB96, 0xFB97, 0xFB98, 0xFB99}, 
        {0x06B4, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x06B5, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x06B6, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x06B7, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x06B8, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x06B9, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x06BA, 0x0804, 0xFB9E, 0xFB9F, 0xFB9F, 0xFB9F}, 
        {0x06BB, 0x0881, 0xFBA0, 0xFBA1, 0xFBA2, 0xFBA3}, 
        {0x06BC, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x06BD, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x06BE, 0x0881, 0xFBAA, 0xFBAB, 0xFBAC, 0xFBAD}, 
        {0x06BF, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x06C0, 0x0804, 0xFBA4, 0xFBA5, 0xFBA5, 0xFBA5}, 
        {0x06C1, 0x0881, 0xFBA6, 0xFBA7, 0xFBA8, 0xFBA9}, 
        {0x06C2, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x06C3, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x06C4, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x06C5, 0x0804, 0xFBE0, 0xFBE1, 0xFBE1, 0xFBE1}, 
        {0x06C6, 0x0804, 0xFBD9, 0xFBDA, 0xFBDA, 0xFBDA}, 
        {0x06C7, 0x0804, 0xFBD7, 0xFBD8, 0xFBD8, 0xFBD8}, 
        {0x06C8, 0x0804, 0xFBDB, 0xFBDC, 0xFBDC, 0xFBDC}, 
        {0x06C9, 0x0804, 0xFBE2, 0xFBE3, 0xFBE3, 0xFBE3}, 
        {0x06CA, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x06CB, 0x0804, 0xFBDE, 0xFBDF, 0xFBDF, 0xFBDF}, 
        {0x06CC, 0x0881, 0xFBFC, 0xFBFD, 0xFBFE, 0xFBFF}, 
        {0x06CD, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x06CE, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x06CF, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x06D0, 0x0881, 0xFBE4, 0xFBE5, 0xFBE6, 0xFBE7}, 
        {0x06D1, 0x000F, 0x0, 0x0, 0x0, 0x0},
        {0x06D2, 0x0804, 0xFBAE, 0xFBAF, 0xFBAF, 0xFBAF}, 
        {0x06D3, 0x0804, 0xFBB0, 0xFBB1, 0xFBB1, 0xFBB1} 
     };

	private static final char reversShapeMApB[][]={
		{0xFE70, 0x0001, 0x064B  },
		{0xFE71, 0x0002, 0x064B  },
		{0xFE72, 0x0001, 0x064C  },
		{0xFE73, 0x0008, 0xFE73  },
		{0xFE74, 0x0001, 0x064D  },
		{0xFE75, 0x000F, 0x0  },
		{0xFE76, 0x0001, 0x064E  },
		{0xFE77, 0x0002, 0x064E  },
		{0xFE78, 0x0001, 0x064F  },
		{0xFE79, 0x0002, 0x064F  },
		{0xFE7A, 0x0001, 0x0650  },
		{0xFE7B, 0x0002, 0x0650  },
		{0xFE7C, 0x0001, 0x0651  },
		{0xFE7D, 0x0002, 0x0651  },
		{0xFE7E, 0x0001, 0x0652  },
		{0xFE7F, 0x0002, 0x0652  },
		{0xFE80, 0x0001, 0x0621  },
		{0xFE81, 0x0001, 0x0622  },
		{0xFE82, 0x0001, 0x0622  },
		{0xFE83, 0x0001, 0x0623  },
		{0xFE84, 0x0001, 0x0623  },
		{0xFE85, 0x0001, 0x0624  },
		{0xFE86, 0x0001, 0x0624  },
		{0xFE87, 0x0001, 0x0625  },
		{0xFE88, 0x0001, 0x0625  },
		{0xFE89, 0x0001, 0x0626  },
		{0xFE8A, 0x0001, 0x0626  },
		{0xFE8B, 0x0001, 0x0626  },
		{0xFE8C, 0x0001, 0x0626  },
		{0xFE8D, 0x0001, 0x0627  },
		{0xFE8E, 0x0001, 0x0627  },
		{0xFE8F, 0x0001, 0x0628  },
		{0xFE90, 0x0001, 0x0628  },
		{0xFE91, 0x0001, 0x0628  },
		{0xFE92, 0x0001, 0x0628  },
		{0xFE93, 0x0001, 0x0629  },
		{0xFE94, 0x0001, 0x0629  },
		{0xFE95, 0x0001, 0x062A  },
		{0xFE96, 0x0001, 0x062A  },
		{0xFE97, 0x0001, 0x062A  },
		{0xFE98, 0x0001, 0x062A  },
		{0xFE99, 0x0001, 0x062B  },
		{0xFE9A, 0x0001, 0x062B  },
		{0xFE9B, 0x0001, 0x062B  },
		{0xFE9C, 0x0001, 0x062B  },
		{0xFE9D, 0x0001, 0x062C  },
		{0xFE9E, 0x0001, 0x062C  },
		{0xFE9F, 0x0001, 0x062C  },
		{0xFEA0, 0x0001, 0x062C  },
		{0xFEA1, 0x0001, 0x062D  },
		{0xFEA2, 0x0001, 0x062D  },
		{0xFEA3, 0x0001, 0x062D  },
		{0xFEA4, 0x0001, 0x062D  },
		{0xFEA5, 0x0001, 0x062E  },
		{0xFEA6, 0x0001, 0x062E  },
		{0xFEA7, 0x0001, 0x062E  },
		{0xFEA8, 0x0001, 0x062E  },
		{0xFEA9, 0x0001, 0x062F  },
		{0xFEAA, 0x0001, 0x062F  },
		{0xFEAB, 0x0001, 0x0630  },
		{0xFEAC, 0x0001, 0x0630  },
		{0xFEAD, 0x0001, 0x0631  },
		{0xFEAE, 0x0001, 0x0631  },
		{0xFEAF, 0x0001, 0x0632  },
		{0xFEB0, 0x0001, 0x0632  },
		{0xFEB1, 0x0001, 0x0633  },
		{0xFEB2, 0x0001, 0x0633  },
		{0xFEB3, 0x0001, 0x0633  },
		{0xFEB4, 0x0001, 0x0633  },
		{0xFEB5, 0x0001, 0x0634  },
		{0xFEB6, 0x0001, 0x0634  },
		{0xFEB7, 0x0001, 0x0634  },
		{0xFEB8, 0x0001, 0x0634  },
		{0xFEB9, 0x0001, 0x0635  },
		{0xFEBA, 0x0001, 0x0635  },
		{0xFEBB, 0x0001, 0x0635  },
		{0xFEBC, 0x0001, 0x0635  },
		{0xFEBD, 0x0001, 0x0636  },
		{0xFEBE, 0x0001, 0x0636  },
		{0xFEBF, 0x0001, 0x0636  },
		{0xFEC0, 0x0001, 0x0636  },
		{0xFEC1, 0x0001, 0x0637  },
		{0xFEC2, 0x0001, 0x0637  },
		{0xFEC3, 0x0001, 0x0637  },
		{0xFEC4, 0x0001, 0x0637  },
		{0xFEC5, 0x0001, 0x0638  },
		{0xFEC6, 0x0001, 0x0638  },
		{0xFEC7, 0x0001, 0x0638  },
		{0xFEC8, 0x0001, 0x0638  },
		{0xFEC9, 0x0001, 0x0639  },
		{0xFECA, 0x0001, 0x0639  },
		{0xFECB, 0x0001, 0x0639  },
		{0xFECC, 0x0001, 0x0639  },
		{0xFECD, 0x0001, 0x063A  },
		{0xFECE, 0x0001, 0x063A  },
		{0xFECF, 0x0001, 0x063A  },
		{0xFED0, 0x0001, 0x063A  },
		{0xFED1, 0x0001, 0x0641  },
		{0xFED2, 0x0001, 0x0641  },
		{0xFED3, 0x0001, 0x0641  },
		{0xFED4, 0x0001, 0x0641  },
		{0xFED5, 0x0001, 0x0642  },
		{0xFED6, 0x0001, 0x0642  },
		{0xFED7, 0x0001, 0x0642  },
		{0xFED8, 0x0001, 0x0642  },
		{0xFED9, 0x0001, 0x0643  },
		{0xFEDA, 0x0001, 0x0643  },
		{0xFEDB, 0x0001, 0x0643  },
		{0xFEDC, 0x0001, 0x0643  },
		{0xFEDD, 0x0001, 0x0644  },
		{0xFEDE, 0x0001, 0x0644  },
		{0xFEDF, 0x0001, 0x0644  },
		{0xFEE0, 0x0001, 0x0644  },
		{0xFEE1, 0x0001, 0x0645  },
		{0xFEE2, 0x0001, 0x0645  },
		{0xFEE3, 0x0001, 0x0645  },
		{0xFEE4, 0x0001, 0x0645  },
		{0xFEE5, 0x0001, 0x0646  },
		{0xFEE6, 0x0001, 0x0646  },
		{0xFEE7, 0x0001, 0x0646  },
		{0xFEE8, 0x0001, 0x0646  },
		{0xFEE9, 0x0001, 0x0647  },
		{0xFEEA, 0x0001, 0x0647  },
		{0xFEEB, 0x0001, 0x0647  },
		{0xFEEC, 0x0001, 0x0647  },
		{0xFEED, 0x0001, 0x0648  },
		{0xFEEE, 0x0001, 0x0648  },
		{0xFEEF, 0x0001, 0x0649  },
		{0xFEF0, 0x0001, 0x0649  },
		{0xFEF1, 0x0001, 0x064A  },
		{0xFEF2, 0x0001, 0x064A  },
		{0xFEF3, 0x0001, 0x064A  },
		{0xFEF4, 0x0001, 0x064A  },
		{0xFEF5, 0x0004, 0x0622  },
		{0xFEF6, 0x0004, 0x0622  },
		{0xFEF7, 0x0004, 0x0623  },
		{0xFEF8, 0x0004, 0x0623  },
		{0xFEF9, 0x0004, 0x0625  },
		{0xFEFA, 0x0004, 0x0625  },
		{0xFEFB, 0x0004, 0x0627  },
		{0xFEFC, 0x0004, 0x0627  },
	};
	
	private static final char reversShapeMApA[][]={
	{0xFB50, 0x0001, 0x0671  },
	{0xFB51, 0x0001, 0x0671  },
	{0xFB52, 0x0001, 0x067B  },
	{0xFB53, 0x0001, 0x067B  },
	{0xFB54, 0x0001, 0x067B  },
	{0xFB55, 0x0001, 0x067B  },
	{0xFB56, 0x0001, 0x067E  },
	{0xFB57, 0x0001, 0x067E  },
	{0xFB58, 0x0001, 0x067E  },
	{0xFB59, 0x0001, 0x067E  },
	{0xFB5A, 0x0001, 0x0680  },
	{0xFB5B, 0x0001, 0x0680  },
	{0xFB5C, 0x0001, 0x0680  },
	{0xFB5D, 0x0001, 0x0680  },
	{0xFB5E, 0x0001, 0x067A  },
	{0xFB5F, 0x0001, 0x067A  },
	{0xFB60, 0x0001, 0x067A  },
	{0xFB61, 0x0001, 0x067A  },
	{0xFB62, 0x0001, 0x067F  },
	{0xFB63, 0x0001, 0x067F  },
	{0xFB64, 0x0001, 0x067F  },
	{0xFB65, 0x0001, 0x067F  },
	{0xFB66, 0x0001, 0x0679  },
	{0xFB67, 0x0001, 0x0679  },
	{0xFB68, 0x0001, 0x0679  },
	{0xFB69, 0x0001, 0x0679  },
	{0xFB6A, 0x0001, 0x06A4  },
	{0xFB6B, 0x0001, 0x06A4  },
	{0xFB6C, 0x0001, 0x06A4  },
	{0xFB6D, 0x0001, 0x06A4  },
	{0xFB6E, 0x0001, 0x06A6  },
	{0xFB6F, 0x0001, 0x06A6  },
	{0xFB70, 0x0001, 0x06A6  },
	{0xFB71, 0x0001, 0x06A6  },
	{0xFB72, 0x0001, 0x0684  },
	{0xFB73, 0x0001, 0x0684  },
	{0xFB74, 0x0001, 0x0684  },
	{0xFB75, 0x0001, 0x0684  },
	{0xFB76, 0x0001, 0x0683  },
	{0xFB77, 0x0001, 0x0683  },
	{0xFB78, 0x0001, 0x0683  },
	{0xFB79, 0x0001, 0x0683  },
	{0xFB7A, 0x0001, 0x0686  },
	{0xFB7B, 0x0001, 0x0686  },
	{0xFB7C, 0x0001, 0x0686  },
	{0xFB7D, 0x0001, 0x0686  },
	{0xFB7E, 0x0001, 0x0687  },
	{0xFB7F, 0x0001, 0x0687  },
	{0xFB80, 0x0001, 0x0687  },
	{0xFB81, 0x0001, 0x0687  },
	{0xFB82, 0x0001, 0x068D  },
	{0xFB83, 0x0001, 0x068D  },
	{0xFB84, 0x0001, 0x068C  },
	{0xFB85, 0x0001, 0x068C  },
	{0xFB86, 0x0001, 0x068E  },
	{0xFB87, 0x0001, 0x068E  },
	{0xFB88, 0x0001, 0x0688  },
	{0xFB89, 0x0001, 0x0688  },
	{0xFB8A, 0x0001, 0x0698  },
	{0xFB8B, 0x0001, 0x0698  },
	{0xFB8C, 0x0001, 0x0691  },
	{0xFB8D, 0x0001, 0x0691  },
	{0xFB8E, 0x0001, 0x06A9  },
	{0xFB8F, 0x0001, 0x06A9  },
	{0xFB90, 0x0001, 0x06A9  },
	{0xFB91, 0x0001, 0x06A9  },
	{0xFB92, 0x0001, 0x06AF  },
	{0xFB93, 0x0001, 0x06AF  },
	{0xFB94, 0x0001, 0x06AF  },
	{0xFB95, 0x0001, 0x06AF  },
	{0xFB96, 0x0001, 0x06B3  },
	{0xFB97, 0x0001, 0x06B3  },
	{0xFB98, 0x0001, 0x06B3  },
	{0xFB99, 0x0001, 0x06B3  },
	{0xFB9A, 0x0001, 0x06B1  },
	{0xFB9B, 0x0001, 0x06B1  },
	{0xFB9C, 0x0001, 0x06B1  },
	{0xFB9D, 0x0001, 0x06B1  },
	{0xFB9E, 0x0001, 0x06BA  },
	{0xFB9F, 0x0001, 0x06BA  },
	{0xFBA0, 0x0001, 0x06BB  },
	{0xFBA1, 0x0001, 0x06BB  },
	{0xFBA2, 0x0001, 0x06BB  },
	{0xFBA3, 0x0001, 0x06BB  },
	{0xFBA4, 0x0001, 0x06C0  },
	{0xFBA5, 0x0001, 0x06C0  },
	{0xFBA6, 0x0001, 0x06C1  },
	{0xFBA7, 0x0001, 0x06C1  },
	{0xFBA8, 0x0001, 0x06C1  },
	{0xFBA9, 0x0001, 0x06C1  },
	{0xFBAA, 0x0001, 0x06BE  },
	{0xFBAB, 0x0001, 0x06BE  },
	{0xFBAC, 0x0001, 0x06BE  },
	{0xFBAD, 0x0001, 0x06BE  },
	{0xFBAE, 0x0001, 0x06D2  },
	{0xFBAF, 0x0001, 0x06D2  },
	{0xFBB0, 0x0001, 0x06D3  },
	{0xFBB1, 0x0001, 0x06D3  },
	
	{0xFBB2, 0x000F, 0x0000  },
	{0xFBB3, 0x000F, 0x0000   },
	{0xFBB4, 0x000F, 0x0000   },
	{0xFBB5, 0x000F, 0x0000   },
	{0xFBB6, 0x000F, 0x0000   },
	{0xFBB7, 0x000F, 0x0000   },
	{0xFBB8, 0x000F, 0x0000   },
	{0xFBB9, 0x000F, 0x0000   },
	{0xFBBA, 0x000F, 0x0000   },
	{0xFBBB, 0x000F, 0x0000   },
	{0xFBBC, 0x000F, 0x0000   },
	{0xFBBD, 0x000F, 0x0000   },
	{0xFBBE, 0x000F, 0x0000   },
	{0xFBBF, 0x000F, 0x0000   },
	{0xFBC0, 0x000F, 0x0000   },
	{0xFBC1, 0x000F, 0x0000   },
	{0xFBC2, 0x000F, 0x0000   },
	{0xFBC3, 0x000F, 0x0000   },
	{0xFBC4, 0x000F, 0x0000   },
	{0xFBC5, 0x000F, 0x0000   },
	{0xFBC6, 0x000F, 0x0000   },
	{0xFBC7, 0x000F, 0x0000   },
	{0xFBC8, 0x000F, 0x0000   },
	{0xFBC9, 0x000F, 0x0000   },
	{0xFBCA, 0x000F, 0x0000   },
	{0xFBCB, 0x000F, 0x0000   },
	{0xFBCC, 0x000F, 0x0000   },
	{0xFBCD, 0x000F, 0x0000   },
	{0xFBCE, 0x000F, 0x0000   },
	{0xFBCF, 0x000F, 0x0000   },
	{0xFBD0, 0x000F, 0x0000   },
	{0xFBD1, 0x000F, 0x0000   },
	{0xFBD2, 0x000F, 0x0000  },
	
	{0xFBD3, 0x0001, 0x06AD  },
	{0xFBD4, 0x0001, 0x06AD  },
	{0xFBD5, 0x0001, 0x06AD  },
	{0xFBD6, 0x0001, 0x06AD  },
	{0xFBD7, 0x0001, 0x06C7  },
	{0xFBD8, 0x0001, 0x06C7  },
	{0xFBD9, 0x0001, 0x06C6  },
	{0xFBDA, 0x0001, 0x06C6  },
	{0xFBDB, 0x0001, 0x06C8  },
	{0xFBDC, 0x0001, 0x06C8  },
	{0xFBDD, 0x0001, 0x0677  },
	{0xFBDE, 0x0001, 0x06CB  },
	{0xFBDF, 0x0001, 0x06CB  },
	{0xFBE0, 0x0001, 0x06C5  },
	{0xFBE1, 0x0001, 0x06C5  },
	{0xFBE2, 0x0001, 0x06C9  },
	{0xFBE3, 0x0001, 0x06C5  },
	{0xFBE4, 0x0001, 0x06D0  },
	{0xFBE5, 0x0001, 0x06D0  },
	{0xFBE6, 0x0001, 0x06D0  },
	{0xFBE7, 0x0001, 0x06D0  },
	{0xFBE8, 0x0001, 0x0649  },
	{0xFBE9, 0x0001, 0x0649  }
	

	};       
                
             public static String reshape(String Str){
                 String Temp=" "+Str+" ";
                 char pre,at,post;
                 StringBuilder  reshapedString=new StringBuilder() ;
                 int i=0;
                 int len=Str.length();
            
                 char post_post;
                 char pre_pre=' ';
                 
                 while (i<len){
                                pre=Temp.charAt(i);
                                at=Temp.charAt(i+1);
                                post=Temp.charAt(i+2);
                                

                                int which_case=getCase(at);
                                int what_case_post=getCase(post);
                                int what_case_pre=getCase(pre);
                                int what_case_post_post;
                                int what_case_pre_pre;
                                //which_case=0x000F&
                //              Log.v("what case"," :" +which_case);
                                int pre_step=0;
                                if (what_case_pre==TASHKEEL){
                                        pre=pre_pre;
                                        what_case_pre=getCase(pre);
                                }
                                if ((what_case_pre&LEFT_CHAR_MASK)==LEFT_CHAR_MASK){
                                        pre_step=1;
                                                
                                } 

                                
                                switch (which_case&0x000F){
                        
                                case NOTUSED_CHAR:
                                case NOTARABIC_CHAR:
                                
                                        reshapedString.append(at);
                        
                                        i++;
                                        continue;
                                case NORIGHT_NOLEFT_CHAR:
                                case TATWEEL_CHAR:
                                        reshapedString.append(getShape(at,0));
                
                                        i++;
                                        continue;
                                case RIGHT_LEFT_CHAR_LAM:
                                        

                                        if ((what_case_post&0x000F)==RIGHT_NOLEFT_CHAR_ALEF){
                                                reshapedString.append(getShape(post,pre_step+2));
                                                i=i+2;
                
                                                continue;
                                        } else if ((what_case_post&RIGHT_NOLEFT_CHAR_MASK)==RIGHT_NOLEFT_CHAR_MASK){
                                                reshapedString.append(getShape(at,2+pre_step));
                                                i=i+1;
                        
                                                continue;                                       
                                                
                                                
                                        } else if (what_case_post==TANWEEN){
                                                reshapedString.append(getShape(at,pre_step));
                                                i=i+1;
                                                continue;
                                                
                                                
                                        } else if (what_case_post==TASHKEEL){
                                                post_post=Temp.charAt(i+3);
                                                what_case_post_post=getCase(post_post);
                                                if ((what_case_post_post&RIGHT_NOLEFT_CHAR_MASK)==RIGHT_NOLEFT_CHAR_MASK){
                                                        reshapedString.append(getShape(at,2+pre_step));
                                                        i=i+1;
                        
                                                        continue;
                                                        
                                                } else {
                                                        reshapedString.append(getShape(at,pre_step));
                                                        i=i+1;
                                                        continue;
                                                        
                                                }
                                                        
                                                
                                                
                                                
                                                
                                        } else  {
                                                reshapedString.append(getShape(at,pre_step));
                                                i=i+1;
                                                continue;
                                                
                                        }
                                        
                                case RIGHT_LEFT_CHAR:
                                        if ((what_case_post&RIGHT_NOLEFT_CHAR_MASK)==RIGHT_NOLEFT_CHAR_MASK){
                                                reshapedString.append(getShape(at,2+pre_step));
                                                i=i+1;
                                                continue;                                       
                                                
                                                
                                        } else  if (what_case_post==TANWEEN){
                                                reshapedString.append(getShape(at,pre_step));
                                                i=i+1;
                                                continue;
                                                
                                                
                                        } else if (what_case_post==TASHKEEL){
                                                post_post=Temp.charAt(i+3);
                                                what_case_post_post=getCase(post_post);
                                                if ((what_case_post_post&RIGHT_NOLEFT_CHAR_MASK)==RIGHT_NOLEFT_CHAR_MASK){
                                                        reshapedString.append(getShape(at,2+pre_step));
                                                        i=i+1;
                                                        continue;
                                                        
                                                } else {
                                                        reshapedString.append(getShape(at,pre_step));
                                                        i=i+1;
                                                        continue;
                                                        
                                                }
                                                        
                                                
                                                
                                                
                                                
                                        } else  {
                                                reshapedString.append(getShape(at,pre_step));
                                                i=i+1;
                                                continue;
                                                
                                        }
                                case RIGHT_NOLEFT_CHAR_ALEF:
                                case RIGHT_NOLEFT_CHAR:
                                        reshapedString.append(getShape(at,pre_step));
                                        i=i+1;
                                        continue;
                                case TASHKEEL:
                                        reshapedString.append(getShape(at,0));
                                        i++;
                                        pre_pre=pre;
                                        continue;
                                case TANWEEN:
                                        reshapedString.append(getShape(at,0));
                                        i++;
                                        pre_pre=pre;
                                        continue;
                                        
                                        
                                        
                                default:
                                        reshapedString.append(getShape(at,0));
                                        i++;
                                        
                                
                                }
                                
                         
                         
                 }
                 
                 return reshapedString.toString();
             }
        
             public static String reshape_reverse(String Str){
                 String Temp=" "+Str+"   ";
                 char pre,at,post;
                 StringBuilder  reshapedString=new StringBuilder() ;
                 int i=0;
                 int len=Str.length();
            
                 char post_post;
                 char pre_pre=' ';
                 
                 while (i<len){
                                pre=Temp.charAt(i+2);
                                at=Temp.charAt(i+1);
                                post=Temp.charAt(i);
                                

                                int which_case=getCase(at);
                                int what_case_post=getCase(post);
                                int what_case_pre=getCase(pre);
                                int what_case_post_post;
                                int what_case_pre_pre;
                                //which_case=0x000F&
                //              Log.v("what case"," :" +which_case);
                                int pre_step=0;
                                if (what_case_pre==TASHKEEL){
                                        pre=Temp.charAt(i+3);
                                        what_case_pre=getCase(pre);
                                }
                                if ((what_case_pre&LEFT_CHAR_MASK)==LEFT_CHAR_MASK){
                                        pre_step=1;
                                                
                                } 

                //              System.out.println("##letter "+ pre);
                                switch (which_case&0x000F){
                        
                                case NOTUSED_CHAR:
                                case NOTARABIC_CHAR:
                                
                                        reshapedString.append(at);
                        
                                        i++;
                                        continue;
                                case NORIGHT_NOLEFT_CHAR:
                                case TATWEEL_CHAR:
                                        reshapedString.append(getShape(at,0));
                
                                        i++;
                                        continue;
                                case RIGHT_NOLEFT_CHAR_ALEF:
                                
                                //      System.out.println("--letter "+ pre);

                                        if ((what_case_pre&0x000F)==RIGHT_LEFT_CHAR_LAM){
                                                pre=Temp.charAt(i+3);
                                        //      System.out.println("++letter "+ pre);
                                                what_case_pre=getCase(pre);
                                                pre_step=0;
                                                if ((what_case_pre&LEFT_CHAR_MASK)==LEFT_CHAR_MASK){
                                                        pre_step=1;
                                                                
                                                } 
                                                reshapedString.append(getShape(at,pre_step+2));
                                                i=i+2;
                
                                                continue;
                                        } /*else if ((what_case_post&RIGHT_NOLEFT_CHAR_MASK)==RIGHT_NOLEFT_CHAR_MASK){
                                                reshapedString.append(getShape(at,2+pre_step));
                                                i=i+1;
                        
                                                continue;                                       
                                                
                                                
                                        } else if (what_case_post==TANWEEN){
                                                reshapedString.append(getShape(at,pre_step));
                                                i=i+1;
                                                continue;
                                                
                                                
                                        } else if (what_case_post==TASHKEEL){
                                                post_post=Temp.charAt(i+3);
                                                what_case_post_post=getCase(post_post);
                                                if ((what_case_post_post&RIGHT_NOLEFT_CHAR_MASK)==RIGHT_NOLEFT_CHAR_MASK){
                                                        reshapedString.append(getShape(at,2+pre_step));
                                                        i=i+1;
                        
                                                        continue;
                                                        
                                                } else {
                                                        reshapedString.append(getShape(at,pre_step));
                                                        i=i+1;
                                                        continue;
                                                        
                                                }
                                                        
                                                
                                                
                                                
                                                
                                        } */else  {
                                                reshapedString.append(getShape(at,pre_step));
                                                i=i+1;
                                                continue;
                                                
                                        }
                                case RIGHT_LEFT_CHAR_LAM:       
                                case RIGHT_LEFT_CHAR:
                                        if ((what_case_post&RIGHT_NOLEFT_CHAR_MASK)==RIGHT_NOLEFT_CHAR_MASK){
                                                reshapedString.append(getShape(at,2+pre_step));
                                                i=i+1;
                                                continue;                                       
                                                
                                                
                                        } else  if (what_case_post==TANWEEN){
                                                reshapedString.append(getShape(at,pre_step));
                                                i=i+1;
                                                continue;
                                                
                                                
                                        } else if (what_case_post==TASHKEEL){
                                                post_post=Temp.charAt(i+3);
                                                what_case_post_post=getCase(post_post);
                                                if ((what_case_post_post&RIGHT_NOLEFT_CHAR_MASK)==RIGHT_NOLEFT_CHAR_MASK){
                                                        reshapedString.append(getShape(at,2+pre_step));
                                                        i=i+1;
                                                        continue;
                                                        
                                                } else {
                                                        reshapedString.append(getShape(at,pre_step));
                                                        i=i+1;
                                                        continue;
                                                        
                                                }
                                                        
                                                
                                                
                                                
                                                
                                        } else  {
                                                reshapedString.append(getShape(at,pre_step));
                                                i=i+1;
                                                continue;
                                                
                                        }
                                
                                case RIGHT_NOLEFT_CHAR:
                                        reshapedString.append(getShape(at,pre_step));
                                        i=i+1;
                                        continue;
                                case TASHKEEL:
                                        reshapedString.append(getShape(at,0));
                                        i++;
                                        pre_pre=pre;
                                        continue;
                                case TANWEEN:
                                        reshapedString.append(getShape(at,0));
                                        i++;
                                        pre_pre=pre;
                                        continue;
                                        
                                        
                                        
                                default:
                                        reshapedString.append(getShape(at,0));
                                        i++;
                                        
                                
                                }
                                
                         
                         
                 }
                 
                 return reshapedString.toString();
             }        
             
             
             

             public static String reshape_browser(String Str){
                 String Temp=" "+Str+" ";
                 char pre,at,post;
                 StringBuilder  reshapedString=new StringBuilder() ;
                 int i=0;
                 int len=Str.length();
                 boolean pre_can_connect=false;
                 char post_post;
                 char pre_pre=' ';
                 
                 while (i<len){
                                pre=Temp.charAt(i);
                                at=Temp.charAt(i+1);
                                post=Temp.charAt(i+2);
                                

                                int which_case=getCase(at);
                                int what_case_post=getCase(post);
                                int what_case_pre=getCase(pre);
                                int what_case_post_post;
                                int what_case_pre_pre;
                                //which_case=0x000F&
                        //      Log.v("what case"," :" +which_case);

        
                                if (at=='\u060c'){
                                        reshapedString.append(',');
                                        i++;
                                        continue;
                                }       
                        //      if (at==)
                                
                                int pre_step=0;
                                if (what_case_pre==TASHKEEL){
                                        pre=pre_pre;
                                        what_case_pre=getCase(pre);
                                }
                                if ((what_case_pre&LEFT_CHAR_MASK)==LEFT_CHAR_MASK){
                                        pre_step=1;
                                                
                                } 

                                
                                switch (which_case&0x000F){
                        
                                case NOTUSED_CHAR:
                                case NOTARABIC_CHAR:
                                
                                        reshapedString.append(at);
                                        pre_can_connect=false;
                                        i++;
                                        continue;
                                case NORIGHT_NOLEFT_CHAR:
                                        reshapedString.append(getShape(at,0));
                                        i++;
                                        continue;
                                case TATWEEL_CHAR:
                                        reshapedString.append(getShape(at,0));
                                        pre_can_connect=false;
                                        i++;
                                        continue;
                                case RIGHT_LEFT_CHAR_LAM:
                                        

                                        if ((what_case_post&0x000F)==RIGHT_NOLEFT_CHAR_ALEF){
                                                reshapedString.append(getShape(post,pre_step+2));
                                                i=i+2;
                                                pre_can_connect=false;
                                                continue;
                                        } else if ((what_case_post&RIGHT_NOLEFT_CHAR_MASK)==RIGHT_NOLEFT_CHAR_MASK){
                                                reshapedString.append(getShape(at,2+pre_step));
                                                i=i+1;
                                                pre_can_connect=true;
                                                continue;                                       
                                                
                                                
                                        } else if (what_case_post==TANWEEN){
                                                reshapedString.append(getShape(at,pre_step));
                                                i=i+1;
                                                continue;
                                                
                                                
                                        } else if (what_case_post==TASHKEEL){
                                                post_post=Temp.charAt(i+2);
                                                what_case_post_post=getCase(post_post);
                                                if ((what_case_post_post&RIGHT_NOLEFT_CHAR_MASK)==RIGHT_NOLEFT_CHAR_MASK){
                                                        reshapedString.append(getShape(at,2+pre_step));
                                                        i=i+1;
                                                        pre_can_connect=true;
                                                        continue;
                                                        
                                                } else {
                                                        reshapedString.append(getShape(at,pre_step));
                                                        i=i+1;
                                                        continue;
                                                        
                                                }
                                                        
                                                
                                                
                                                
                                                
                                        } else  {
                                                reshapedString.append(getShape(at,pre_step));
                                                i=i+1;
                                                continue;
                                                
                                        }
                                        
                                case RIGHT_LEFT_CHAR:
                                        if ((what_case_post&RIGHT_NOLEFT_CHAR_MASK)==RIGHT_NOLEFT_CHAR_MASK){
                                                reshapedString.append(getShape(at,2+pre_step));
                                                i=i+1;
                                                continue;                                       
                                                
                                                
                                        } else  if (what_case_post==TANWEEN){
                                                reshapedString.append(getShape(at,pre_step));
                                                i=i+1;
                                                continue;
                                                
                                                
                                        } else if (what_case_post==TASHKEEL){
                                                post_post=Temp.charAt(i+3);
                                                what_case_post_post=getCase(post_post);
                                                if ((what_case_post_post&RIGHT_NOLEFT_CHAR_MASK)==RIGHT_NOLEFT_CHAR_MASK){
                                                        reshapedString.append(getShape(at,2+pre_step));
                                                        i=i+1;
                                                        pre_can_connect=true;
                                                        continue;
                                                        
                                                } else {
                                                        reshapedString.append(getShape(at,pre_step));
                                                        i=i+1;
                                                        continue;
                                                        
                                                }
                                                        
                                                
                                                
                                                
                                                
                                        } else  {
                                                reshapedString.append(getShape(at,pre_step));
                                                i=i+1;
                                                continue;
                                                
                                        }
                                case RIGHT_NOLEFT_CHAR_ALEF:
                                case RIGHT_NOLEFT_CHAR:
                                        reshapedString.append(getShape(at,pre_step));
                                        i=i+1;
                                        continue;
                                case TASHKEEL:
                                        reshapedString.append(getShape(at,0));
                                        i++;
                                        pre_pre=pre;
                                        continue;
                                case TANWEEN:
                                        reshapedString.append(getShape(at,0));
                                        i++;
                                        pre_pre=pre;
                                        continue;
                                        
                                        
                                        
                                default:
                                        reshapedString.append(getShape(at,0));
                                        i++;
                                        
                                
                                }
                                
                         
                         
                 }
                 
                 return reshapedString.toString();
             }  
  
  
             

             

             



 public static String unReshape(String Str){
    	    	 StringBuilder unReshapeString= new StringBuilder();
    	    	 
    	    	 int len= Str.length();
    	    	 for (int i=0;i<len; i++){
    	    		 char ch= Str.charAt(i);
    	    		 int char_case=getReverseCase(ch);
    	    			
    	    		 switch (char_case){
    	    		 
    	    		 case 0x000F:
    	    		 case 0x0000:
    	    			 unReshapeString.append(ch);
    	    			 break;
    	    		 case 0x0001:
    	    			 unReshapeString.append(getReverseShape(ch));
    	    			 break;
    	    		 case 0x0002:
    	    			 unReshapeString.append('\u0640');
    	    			 unReshapeString.append(getReverseShape(ch));
    	    			 break;
    	    		 case 0x0004:
    	    			 unReshapeString.append('\u0644');
    	    			 unReshapeString.append(getReverseShape(ch));
    	    			 break;
    	    		  default:
    	    			  unReshapeString.append(ch);
    	    			  
    	    		 }
    	    		 
    	    		 
    	    		 
    	    	 }
    	    	 
    	    	 
    	    	 return unReshapeString.toString();
    	     }             

 public static ArabicCheck reshape(String Str,int pos){
     String Temp=" "+Str+" ";
     char pre,at,post;
     StringBuilder  reshapedString=new StringBuilder() ;
     int i=0;
     int len=Str.length();
     int now =pos;
     char post_post;
     char pre_pre=' ';
     
     while (i<len){
                    pre=Temp.charAt(i);
                    at=Temp.charAt(i+1);
                    post=Temp.charAt(i+2);
                    

                    int which_case=getCase(at);
                    int what_case_post=getCase(post);
                    int what_case_pre=getCase(pre);
                    int what_case_post_post;
                    int what_case_pre_pre;
                    //which_case=0x000F&
    //              Log.v("what case"," :" +which_case);
                    int pre_step=0;
                    if (what_case_pre==TASHKEEL){
                            pre=pre_pre;
                            what_case_pre=getCase(pre);
                    }
                    if ((what_case_pre&LEFT_CHAR_MASK)==LEFT_CHAR_MASK){
                            pre_step=1;
                                    
                    } 

                    
                    switch (which_case&0x000F){
            
                    case NOTUSED_CHAR:
                    case NOTARABIC_CHAR:
                    
                            reshapedString.append(at);
            
                            i++;
                            continue;
                    case NORIGHT_NOLEFT_CHAR:
                    case TATWEEL_CHAR:
                            reshapedString.append(getShape(at,0));
    
                            i++;
                            continue;
                    case RIGHT_LEFT_CHAR_LAM:
                            

                            if ((what_case_post&0x000F)==RIGHT_NOLEFT_CHAR_ALEF){
                                    reshapedString.append(getShape(post,pre_step+2));
                                    i=i+2;
                                    if (i<pos) now--;
    
                                    continue;
                            } else if ((what_case_post&RIGHT_NOLEFT_CHAR_MASK)==RIGHT_NOLEFT_CHAR_MASK){
                                    reshapedString.append(getShape(at,2+pre_step));
                                    i=i+1;
            
                                    continue;                                       
                                    
                                    
                            } else if (what_case_post==TANWEEN){
                                    reshapedString.append(getShape(at,pre_step));
                                    i=i+1;
                                    continue;
                                    
                                    
                            } else if (what_case_post==TASHKEEL){
                                    post_post=Temp.charAt(i+3);
                                    what_case_post_post=getCase(post_post);
                                    if ((what_case_post_post&RIGHT_NOLEFT_CHAR_MASK)==RIGHT_NOLEFT_CHAR_MASK){
                                            reshapedString.append(getShape(at,2+pre_step));
                                            i=i+1;
            
                                            continue;
                                            
                                    } else {
                                            reshapedString.append(getShape(at,pre_step));
                                            i=i+1;
                                            continue;
                                            
                                    }
                                            
                                    
                                    
                                    
                                    
                            } else  {
                                    reshapedString.append(getShape(at,pre_step));
                                    i=i+1;
                                    continue;
                                    
                            }
                            
                    case RIGHT_LEFT_CHAR:
                            if ((what_case_post&RIGHT_NOLEFT_CHAR_MASK)==RIGHT_NOLEFT_CHAR_MASK){
                                    reshapedString.append(getShape(at,2+pre_step));
                                    i=i+1;
                                    continue;                                       
                                    
                                    
                            } else  if (what_case_post==TANWEEN){
                                    reshapedString.append(getShape(at,pre_step));
                                    i=i+1;
                                    continue;
                                    
                                    
                            } else if (what_case_post==TASHKEEL){
                                    post_post=Temp.charAt(i+3);
                                    what_case_post_post=getCase(post_post);
                                    if ((what_case_post_post&RIGHT_NOLEFT_CHAR_MASK)==RIGHT_NOLEFT_CHAR_MASK){
                                            reshapedString.append(getShape(at,2+pre_step));
                                            i=i+1;
                                            continue;
                                            
                                    } else {
                                            reshapedString.append(getShape(at,pre_step));
                                            i=i+1;
                                            continue;
                                            
                                    }
                                            
                                    
                                    
                                    
                                    
                            } else  {
                                    reshapedString.append(getShape(at,pre_step));
                                    i=i+1;
                                    continue;
                                    
                            }
                    case RIGHT_NOLEFT_CHAR_ALEF:
                    case RIGHT_NOLEFT_CHAR:
                            reshapedString.append(getShape(at,pre_step));
                            i=i+1;
                            continue;
                    case TASHKEEL:
                            reshapedString.append(getShape(at,0));
                            i++;
                            pre_pre=pre;
                            continue;
                    case TANWEEN:
                            reshapedString.append(getShape(at,0));
                            i++;
                            pre_pre=pre;
                            continue;
                            
                            
                            
                    default:
                            reshapedString.append(getShape(at,0));
                            i++;
                            
                    
                    }
                    
             
             
     }
     ArabicCheck m = new ArabicCheck();
     m.setConnectedArabic(reshapedString.toString());
     m.setCursorIndex(now);
     return m;
    // return reshapedString.toString();
 }
     
   public static ArabicCheck unReshape(String Str, int pos){
    	    	 StringBuilder unReshapeString= new StringBuilder();
    	    	 int now =pos;
    	    	 int len= Str.length();
    	    	 for (int i=0;i<len; i++){
    	    		 char ch= Str.charAt(i);
    	    		 int char_case=getReverseCase(ch);
    	    			
    	    		 switch (char_case){
    	    		 
    	    		 case 0x000F:
    	    		 case 0x0000:
    	    			 unReshapeString.append(ch);
    	    			 break;
    	    		 case 0x0001:
    	    			 unReshapeString.append(getReverseShape(ch));
    	    			 break;
    	    		 case 0x0002:
    	    			 if (i<pos) now++;
    	    			 unReshapeString.append('\u0640');
    	    			 unReshapeString.append(getReverseShape(ch));
    	    			 break;
    	    		 case 0x0004:
    	    			 if (i<pos) now++;
    	    			 unReshapeString.append('\u0644');
    	    			 unReshapeString.append(getReverseShape(ch));
    	    			 break;
    	    		  default:
    	    			  unReshapeString.append(ch);
    	    			  break;
    	    			  
    	    		 }
    	    		 
    	    		 
    	    		 
    	    	 }
    	    	 
    	    	 ArabicCheck m= new ArabicCheck();
    	    	 m.setConnectedArabic(unReshapeString.toString());
    	    	 m.setCursorIndex(now);
    	    	 
    	    	 return m; 
    	     }
    	    
   static int getReverseCase(char ch){
    	    	 if (ch>=0xfbfc && ch<=0xfbff)
    	    		 return 0x0001;
    	    	 if (ch<0xFB50 || ch>0xFEFC)
    	    		 return 0;
    	    	 if (ch>0xFBE9 && ch <0xFE70)
    	    		 return 0;
    	    	 
    	    	 if (ch>0xFBe9) {
    	    		 return reversShapeMApB[(int)(ch)-0xFE70][1];
    	    	 }
    	    	 else
    	    		 return reversShapeMApB[(int)(ch)-0xFB50][1];
    	    	 
    	     } 

   static char getReverseShape(char ch){
  	 if (ch>=0xfbfc && ch<=0xfbff)
  		 return 0x06CC;
  	 
  	 if (ch<0xFB50 || ch>0xFEFC)
  		 return ch;
  	 if (ch>0xFBE9 && ch <0xFE70)
  		 return ch;
  	 
  	 if (ch>0xFBe9) {
  		 return reversShapeMApB[(int)(ch)-0xFE70][2];
  	 }
  	 else
  		 return reversShapeMApA[(int)(ch)-0xFB50][2]; 
  	
  	 
   }

   static char getShape(char ch, int which_shape){
       
       return allchar[(int)ch-0x0621][2+which_shape];
       
   }
   static int getCase(char ch){
       if (ch<0x0621 || ch>0x06d2 ){
               return 0;
               
               
       }
       else {
               
               return allchar[(int)ch-0x0621][1];
               
       }


}
}