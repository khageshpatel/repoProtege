/* Generated By:JavaCC: Do not edit this line. OBOParserTokenManager.java */
package org.coode.owlapi.obo.parser;

import org.semanticweb.owlapi.model.OWLRuntimeException;

import uk.ac.manchester.cs.BOMSafeJavaCharStream;

/** Token Manager. */
public class OBOParserTokenManager implements OBOParserConstants {

    /** Debug output. */
    public java.io.PrintStream debugStream = System.out;

    /**
     * Set debug output.
     * 
     * @param ds
     *        ds
     */
    public void setDebugStream(java.io.PrintStream ds) {
        debugStream = ds;
    }

    private int jjMoveStringLiteralDfa0_4() {
        return jjMoveNfa_4(5, 0);
    }

    static final long[] jjbitVec0 = { 0xfffffffffffffffeL, 0xffffffffffffffffL,
            0xffffffffffffffffL, 0xffffffffffffffffL };
    static final long[] jjbitVec2 = { 0x0L, 0x0L, 0xffffffffffffffffL,
            0xffffffffffffffffL };

    private int jjMoveNfa_4(int startState, int _curPos) {
        int curPos = _curPos;
        int startsAt = 0;
        jjnewStateCnt = 7;
        int i = 1;
        jjstateSet[0] = startState;
        int kind = 0x7fffffff;
        for (;;) {
            if (++jjround == 0x7fffffff) {
                ReInitRounds();
            }
            if (curChar < 64) {
                long l = 1L << curChar;
                do {
                    switch (jjstateSet[--i]) {
                        case 5:
                            if ((0xfffffffbffffdbffL & l) != 0L) {
                                if (kind > 12) {
                                    kind = 12;
                                }
                                jjCheckNAddTwoStates(0, 1);
                            } else if ((0x2400L & l) != 0L) {
                                if (kind > 14) {
                                    kind = 14;
                                }
                            } else if (curChar == 34) {
                                if (kind > 13) {
                                    kind = 13;
                                }
                            }
                            break;
                        case 0:
                            if ((0xfffffffbffffdbffL & l) == 0L) {
                                break;
                            }
                            kind = 12;
                            jjCheckNAddTwoStates(0, 1);
                            break;
                        case 2:
                            if (curChar != 34) {
                                break;
                            }
                            if (kind > 12) {
                                kind = 12;
                            }
                            jjCheckNAddTwoStates(0, 1);
                            break;
                        case 3:
                            if (curChar != 10) {
                                break;
                            }
                            if (kind > 12) {
                                kind = 12;
                            }
                            jjCheckNAddTwoStates(0, 1);
                            break;
                        case 4:
                            if (curChar != 13) {
                                break;
                            }
                            if (kind > 12) {
                                kind = 12;
                            }
                            jjCheckNAddTwoStates(0, 1);
                            break;
                        case 6:
                            if ((0x2400L & l) != 0L && kind > 14) {
                                kind = 14;
                            }
                            break;
                        default:
                            break;
                    }
                } while (i != startsAt);
            } else if (curChar < 128) {
                do {
                    switch (jjstateSet[--i]) {
                        case 5:
                            if (kind > 12) {
                                kind = 12;
                            }
                            jjCheckNAddTwoStates(0, 1);
                            if (curChar == 92) {
                                jjAddStates(0, 2);
                            }
                            break;
                        case 0:
                            if (kind > 12) {
                                kind = 12;
                            }
                            jjCheckNAddTwoStates(0, 1);
                            break;
                        case 1:
                            if (curChar == 92) {
                                jjAddStates(0, 2);
                            }
                            break;
                        default:
                            break;
                    }
                } while (i != startsAt);
            } else {
                int hiByte = curChar >> 8;
                int i1 = hiByte >> 6;
                long l1 = 1L << (hiByte & 077);
                int i2 = (curChar & 0xff) >> 6;
                long l2 = 1L << (curChar & 077);
                do {
                    switch (jjstateSet[--i]) {
                        case 5:
                        case 0:
                            if (!jjCanMove_0(hiByte, i1, i2, l1, l2)) {
                                break;
                            }
                            if (kind > 12) {
                                kind = 12;
                            }
                            jjCheckNAddTwoStates(0, 1);
                            break;
                        default:
                            break;
                    }
                } while (i != startsAt);
            }
            if (kind != 0x7fffffff) {
                jjmatchedKind = kind;
                jjmatchedPos = curPos;
                kind = 0x7fffffff;
            }
            ++curPos;
            if ((i = jjnewStateCnt) == (startsAt = 7 - (jjnewStateCnt = startsAt))) {
                return curPos;
            }
            try {
                curChar = input_stream.readChar();
            } catch (java.io.IOException e) {
                return curPos;
            }
        }
    }

    private int jjStopAtPos(int pos, int kind) {
        jjmatchedKind = kind;
        jjmatchedPos = pos;
        return pos + 1;
    }

    private int jjMoveStringLiteralDfa0_3() {
        switch (curChar) {
            case 33:
                return jjStopAtPos(0, 18);
            case 34:
                return jjStartNfaWithStates_3(0, 11, 0);
            default:
                return jjMoveNfa_3(2, 0);
        }
    }

    private int jjStartNfaWithStates_3(int pos, int kind, int state) {
        jjmatchedKind = kind;
        jjmatchedPos = pos;
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            return pos + 1;
        }
        return jjMoveNfa_3(state, pos + 1);
    }

    private int jjMoveNfa_3(int startState, int _curPos) {
        int curPos = _curPos;
        int startsAt = 0;
        jjnewStateCnt = 3;
        int i = 1;
        jjstateSet[0] = startState;
        int kind = 0x7fffffff;
        for (;;) {
            if (++jjround == 0x7fffffff) {
                ReInitRounds();
            }
            if (curChar < 64) {
                long l = 1L << curChar;
                do {
                    switch (jjstateSet[--i]) {
                        case 2:
                            if ((0xfffffffcffffd9ffL & l) != 0L) {
                                if (kind > 15) {
                                    kind = 15;
                                }
                                jjCheckNAdd(0);
                            } else if ((0x2400L & l) != 0L) {
                                if (kind > 17) {
                                    kind = 17;
                                }
                            } else if ((0x100000200L & l) != 0L) {
                                if (kind > 16) {
                                    kind = 16;
                                }
                                jjCheckNAdd(1);
                            }
                            break;
                        case 0:
                            if ((0xfffffffcffffd9ffL & l) == 0L) {
                                break;
                            }
                            kind = 15;
                            jjCheckNAdd(0);
                            break;
                        case 1:
                            if ((0x100000200L & l) == 0L) {
                                break;
                            }
                            kind = 16;
                            jjCheckNAdd(1);
                            break;
                        default:
                            break;
                    }
                } while (i != startsAt);
            } else if (curChar < 128) {
                do {
                    switch (jjstateSet[--i]) {
                        case 2:
                        case 0:
                            kind = 15;
                            jjCheckNAdd(0);
                            break;
                        default:
                            break;
                    }
                } while (i != startsAt);
            } else {
                int hiByte = curChar >> 8;
                int i1 = hiByte >> 6;
                long l1 = 1L << (hiByte & 077);
                int i2 = (curChar & 0xff) >> 6;
                long l2 = 1L << (curChar & 077);
                do {
                    switch (jjstateSet[--i]) {
                        case 2:
                        case 0:
                            if (!jjCanMove_0(hiByte, i1, i2, l1, l2)) {
                                break;
                            }
                            if (kind > 15) {
                                kind = 15;
                            }
                            jjCheckNAdd(0);
                            break;
                        default:
                            break;
                    }
                } while (i != startsAt);
            }
            if (kind != 0x7fffffff) {
                jjmatchedKind = kind;
                jjmatchedPos = curPos;
                kind = 0x7fffffff;
            }
            ++curPos;
            if ((i = jjnewStateCnt) == (startsAt = 3 - (jjnewStateCnt = startsAt))) {
                return curPos;
            }
            try {
                curChar = input_stream.readChar();
            } catch (java.io.IOException e) {
                return curPos;
            }
        }
    }

    private int jjMoveStringLiteralDfa0_0() {
        switch (curChar) {
            case 9:
                return jjStartNfaWithStates_0(0, 3, 2);
            case 32:
                return jjStartNfaWithStates_0(0, 4, 2);
            case 91:
                return jjStopAtPos(0, 6);
            default:
                return jjMoveNfa_0(0, 0);
        }
    }

    private int jjStartNfaWithStates_0(int pos, int kind, int state) {
        jjmatchedKind = kind;
        jjmatchedPos = pos;
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            return pos + 1;
        }
        return jjMoveNfa_0(state, pos + 1);
    }

    private int jjMoveNfa_0(int startState, int _curPos) {
        int curPos = _curPos;
        int startsAt = 0;
        jjnewStateCnt = 3;
        int i = 1;
        jjstateSet[0] = startState;
        int kind = 0x7fffffff;
        for (;;) {
            if (++jjround == 0x7fffffff) {
                ReInitRounds();
            }
            if (curChar < 64) {
                long l = 1L << curChar;
                do {
                    switch (jjstateSet[--i]) {
                        case 0:
                            if ((0xfbffffffffffdbffL & l) != 0L) {
                                if (kind > 9) {
                                    kind = 9;
                                }
                                jjCheckNAdd(2);
                            }
                            if (curChar == 33) {
                                if (kind > 5) {
                                    kind = 5;
                                }
                                jjCheckNAdd(1);
                            }
                            break;
                        case 1:
                            if ((0xffffffffffffdbffL & l) == 0L) {
                                break;
                            }
                            if (kind > 5) {
                                kind = 5;
                            }
                            jjCheckNAdd(1);
                            break;
                        case 2:
                            if ((0xfbffffffffffdbffL & l) == 0L) {
                                break;
                            }
                            if (kind > 9) {
                                kind = 9;
                            }
                            jjCheckNAdd(2);
                            break;
                        default:
                            break;
                    }
                } while (i != startsAt);
            } else if (curChar < 128) {
                long l = 1L << (curChar & 077);
                do {
                    switch (jjstateSet[--i]) {
                        case 0:
                        case 2:
                            if ((0xfffffffff7ffffffL & l) == 0L) {
                                break;
                            }
                            if (kind > 9) {
                                kind = 9;
                            }
                            jjCheckNAdd(2);
                            break;
                        case 1:
                            if (kind > 5) {
                                kind = 5;
                            }
                            jjstateSet[jjnewStateCnt++] = 1;
                            break;
                        default:
                            break;
                    }
                } while (i != startsAt);
            } else {
                int hiByte = curChar >> 8;
                int i1 = hiByte >> 6;
                long l1 = 1L << (hiByte & 077);
                int i2 = (curChar & 0xff) >> 6;
                long l2 = 1L << (curChar & 077);
                do {
                    switch (jjstateSet[--i]) {
                        case 0:
                        case 2:
                            if (!jjCanMove_0(hiByte, i1, i2, l1, l2)) {
                                break;
                            }
                            if (kind > 9) {
                                kind = 9;
                            }
                            jjCheckNAdd(2);
                            break;
                        case 1:
                            if (!jjCanMove_0(hiByte, i1, i2, l1, l2)) {
                                break;
                            }
                            if (kind > 5) {
                                kind = 5;
                            }
                            jjstateSet[jjnewStateCnt++] = 1;
                            break;
                        default:
                            break;
                    }
                } while (i != startsAt);
            }
            if (kind != 0x7fffffff) {
                jjmatchedKind = kind;
                jjmatchedPos = curPos;
                kind = 0x7fffffff;
            }
            ++curPos;
            if ((i = jjnewStateCnt) == (startsAt = 3 - (jjnewStateCnt = startsAt))) {
                return curPos;
            }
            try {
                curChar = input_stream.readChar();
            } catch (java.io.IOException e) {
                return curPos;
            }
        }
    }

    private int jjMoveStringLiteralDfa0_1() {
        switch (curChar) {
            case 93:
                return jjStopAtPos(0, 8);
            default:
                return jjMoveNfa_1(0, 0);
        }
    }

    private int jjMoveNfa_1(int startState, int _curPos) {
        int curPos = _curPos;
        int startsAt = 0;
        jjnewStateCnt = 1;
        int i = 1;
        jjstateSet[0] = startState;
        int kind = 0x7fffffff;
        for (;;) {
            if (++jjround == 0x7fffffff) {
                ReInitRounds();
            }
            if (curChar < 64) {
                do {
                    switch (jjstateSet[--i]) {
                        case 0:
                            kind = 7;
                            jjstateSet[jjnewStateCnt++] = 0;
                            break;
                        default:
                            break;
                    }
                } while (i != startsAt);
            } else if (curChar < 128) {
                long l = 1L << (curChar & 077);
                do {
                    switch (jjstateSet[--i]) {
                        case 0:
                            if ((0xffffffffdfffffffL & l) == 0L) {
                                break;
                            }
                            kind = 7;
                            jjstateSet[jjnewStateCnt++] = 0;
                            break;
                        default:
                            break;
                    }
                } while (i != startsAt);
            } else {
                int hiByte = curChar >> 8;
                int i1 = hiByte >> 6;
                long l1 = 1L << (hiByte & 077);
                int i2 = (curChar & 0xff) >> 6;
                long l2 = 1L << (curChar & 077);
                do {
                    switch (jjstateSet[--i]) {
                        case 0:
                            if (!jjCanMove_0(hiByte, i1, i2, l1, l2)) {
                                break;
                            }
                            if (kind > 7) {
                                kind = 7;
                            }
                            jjstateSet[jjnewStateCnt++] = 0;
                            break;
                        default:
                            break;
                    }
                } while (i != startsAt);
            }
            if (kind != 0x7fffffff) {
                jjmatchedKind = kind;
                jjmatchedPos = curPos;
                kind = 0x7fffffff;
            }
            ++curPos;
            if ((i = jjnewStateCnt) == (startsAt = 1 - (jjnewStateCnt = startsAt))) {
                return curPos;
            }
            try {
                curChar = input_stream.readChar();
            } catch (java.io.IOException e) {
                return curPos;
            }
        }
    }

    private int jjMoveStringLiteralDfa0_5() {
        return jjMoveNfa_5(5, 0);
    }

    private int jjMoveNfa_5(int startState, int _curPos) {
        int curPos = _curPos;
        int startsAt = 0;
        jjnewStateCnt = 5;
        int i = 1;
        jjstateSet[0] = startState;
        int kind = 0x7fffffff;
        for (;;) {
            if (++jjround == 0x7fffffff) {
                ReInitRounds();
            }
            if (curChar < 64) {
                long l = 1L << curChar;
                do {
                    switch (jjstateSet[--i]) {
                        case 5:
                            if ((0xffffffffffffdbffL & l) != 0L) {
                                if (kind > 19) {
                                    kind = 19;
                                }
                                jjCheckNAddTwoStates(0, 1);
                            } else if ((0x2400L & l) != 0L) {
                                if (kind > 20) {
                                    kind = 20;
                                }
                                jjCheckNAdd(4);
                            }
                            break;
                        case 0:
                            if ((0xffffffffffffdbffL & l) == 0L) {
                                break;
                            }
                            kind = 19;
                            jjCheckNAddTwoStates(0, 1);
                            break;
                        case 2:
                            if (curChar != 10) {
                                break;
                            }
                            if (kind > 19) {
                                kind = 19;
                            }
                            jjCheckNAddTwoStates(0, 1);
                            break;
                        case 3:
                            if (curChar != 13) {
                                break;
                            }
                            if (kind > 19) {
                                kind = 19;
                            }
                            jjCheckNAddTwoStates(0, 1);
                            break;
                        case 4:
                            if ((0x2400L & l) == 0L) {
                                break;
                            }
                            if (kind > 20) {
                                kind = 20;
                            }
                            jjCheckNAdd(4);
                            break;
                        default:
                            break;
                    }
                } while (i != startsAt);
            } else if (curChar < 128) {
                do {
                    switch (jjstateSet[--i]) {
                        case 5:
                            if (kind > 19) {
                                kind = 19;
                            }
                            jjCheckNAddTwoStates(0, 1);
                            if (curChar == 92) {
                                jjAddStates(3, 4);
                            }
                            break;
                        case 0:
                            if (kind > 19) {
                                kind = 19;
                            }
                            jjCheckNAddTwoStates(0, 1);
                            break;
                        case 1:
                            if (curChar == 92) {
                                jjAddStates(3, 4);
                            }
                            break;
                        default:
                            break;
                    }
                } while (i != startsAt);
            } else {
                int hiByte = curChar >> 8;
                int i1 = hiByte >> 6;
                long l1 = 1L << (hiByte & 077);
                int i2 = (curChar & 0xff) >> 6;
                long l2 = 1L << (curChar & 077);
                do {
                    switch (jjstateSet[--i]) {
                        case 5:
                        case 0:
                            if (!jjCanMove_0(hiByte, i1, i2, l1, l2)) {
                                break;
                            }
                            if (kind > 19) {
                                kind = 19;
                            }
                            jjCheckNAddTwoStates(0, 1);
                            break;
                        default:
                            break;
                    }
                } while (i != startsAt);
            }
            if (kind != 0x7fffffff) {
                jjmatchedKind = kind;
                jjmatchedPos = curPos;
                kind = 0x7fffffff;
            }
            ++curPos;
            if ((i = jjnewStateCnt) == (startsAt = 5 - (jjnewStateCnt = startsAt))) {
                return curPos;
            }
            try {
                curChar = input_stream.readChar();
            } catch (java.io.IOException e) {
                return curPos;
            }
        }
    }

    private int jjMoveStringLiteralDfa0_2() {
        return jjMoveNfa_2(0, 0);
    }

    private int jjMoveNfa_2(int startState, int _curPos) {
        int curPos = _curPos;
        int startsAt = 0;
        jjnewStateCnt = 2;
        int i = 1;
        jjstateSet[0] = startState;
        int kind = 0x7fffffff;
        for (;;) {
            if (++jjround == 0x7fffffff) {
                ReInitRounds();
            }
            if (curChar < 64) {
                do {
                    switch (jjstateSet[--i]) {
                        case 0:
                            if (curChar != 58) {
                                break;
                            }
                            kind = 10;
                            jjCheckNAdd(1);
                            break;
                        case 1:
                            if (curChar != 32) {
                                break;
                            }
                            kind = 10;
                            jjCheckNAdd(1);
                            break;
                        default:
                            break;
                    }
                } while (i != startsAt);
            } else if (curChar < 128) {
                do {
                    switch (jjstateSet[--i]) {
                        default:
                            break;
                    }
                } while (i != startsAt);
            } else {
                do {
                    switch (jjstateSet[--i]) {
                        default:
                            break;
                    }
                } while (i != startsAt);
            }
            if (kind != 0x7fffffff) {
                jjmatchedKind = kind;
                jjmatchedPos = curPos;
                kind = 0x7fffffff;
            }
            ++curPos;
            if ((i = jjnewStateCnt) == (startsAt = 2 - (jjnewStateCnt = startsAt))) {
                return curPos;
            }
            try {
                curChar = input_stream.readChar();
            } catch (java.io.IOException e) {
                return curPos;
            }
        }
    }

    static final int[] jjnextStates = { 2, 3, 4, 2, 3, };

    private static boolean jjCanMove_0(int hiByte, int i1, int i2, long l1,
            long l2) {
        switch (hiByte) {
            case 0:
                return (jjbitVec2[i2] & l2) != 0L;
            default:
                if ((jjbitVec0[i1] & l1) != 0L) {
                    return true;
                }
                return false;
        }
    }

    /** Token literal values. */
    public static final String[] jjstrLiteralImages = { "", null, null, null,
            null, null, "\133", null, "\135", null, null, null, null, null,
            null, null, null, null, null, null, null, null, };
    /** Lexer state names. */
    public static final String[] lexStateNames = { "DEFAULT",
            "IN_STANZA_HEADER", "IN_TAG_VALUE_PAIR", "IN_TAG_VALUE",
            "IN_QUOTED_STRING", "IN_COMMENT", };
    /** Lex State array. */
    public static final int[] jjnewLexState = { -1, -1, -1, -1, -1, -1, 1, -1,
            0, 2, 3, 4, -1, 3, 0, -1, -1, 0, 5, -1, 0, -1, };
    static final long[] jjtoToken = { 0x2993c1L, };
    static final long[] jjtoSkip = { 0x166c3eL, };
    protected BOMSafeJavaCharStream input_stream;
    private final int[] jjrounds = new int[7];
    private final int[] jjstateSet = new int[14];
    protected char curChar;

    /**
     * Constructor.
     * 
     * @param stream
     *        stream
     */
    public OBOParserTokenManager(BOMSafeJavaCharStream stream) {
        if (BOMSafeJavaCharStream.staticFlag) {
            throw new OWLRuntimeException(
                    "ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
        }
        input_stream = stream;
    }

    /**
     * Constructor.
     * 
     * @param stream
     *        stream
     * @param lexState
     *        lexState
     */
    public OBOParserTokenManager(BOMSafeJavaCharStream stream, int lexState) {
        this(stream);
        SwitchTo(lexState);
    }

    /**
     * Reinitialise parser.
     * 
     * @param stream
     *        stream
     */
    public void ReInit(BOMSafeJavaCharStream stream) {
        jjmatchedPos = jjnewStateCnt = 0;
        curLexState = defaultLexState;
        input_stream = stream;
        ReInitRounds();
    }

    private void ReInitRounds() {
        int i;
        jjround = 0x80000001;
        for (i = 7; i-- > 0;) {
            jjrounds[i] = 0x80000000;
        }
    }

    /**
     * Reinitialise parser.
     * 
     * @param stream
     *        stream
     * @param lexState
     *        lexState
     */
    public void ReInit(BOMSafeJavaCharStream stream, int lexState) {
        ReInit(stream);
        SwitchTo(lexState);
    }

    /**
     * Switch to specified lex state.
     * 
     * @param lexState
     *        lexState
     */
    public void SwitchTo(int lexState) {
        if (lexState >= 6 || lexState < 0) {
            throw new TokenMgrError("Error: Ignoring invalid lexical state : "
                    + lexState + ". State unchanged.",
                    TokenMgrError.INVALID_LEXICAL_STATE);
        } else {
            curLexState = lexState;
        }
    }

    protected Token jjFillToken() {
        final Token t;
        final String curTokenImage;
        final int beginLine;
        final int endLine;
        final int beginColumn;
        final int endColumn;
        String im = jjstrLiteralImages[jjmatchedKind];
        curTokenImage = im == null ? input_stream.GetImage() : im;
        beginLine = input_stream.getBeginLine();
        beginColumn = input_stream.getBeginColumn();
        endLine = input_stream.getEndLine();
        endColumn = input_stream.getEndColumn();
        t = Token.newToken(jjmatchedKind, curTokenImage);
        t.beginLine = beginLine;
        t.endLine = endLine;
        t.beginColumn = beginColumn;
        t.endColumn = endColumn;
        return t;
    }

    int curLexState = 0;
    int defaultLexState = 0;
    int jjnewStateCnt;
    int jjround;
    int jjmatchedPos;
    int jjmatchedKind;

    /** @return the next Token. */
    public Token getNextToken() {
        Token matchedToken;
        int curPos = 0;
        EOFLoop: for (;;) {
            try {
                curChar = input_stream.BeginToken();
            } catch (java.io.IOException e) {
                jjmatchedKind = 0;
                matchedToken = jjFillToken();
                return matchedToken;
            }
            switch (curLexState) {
                case 0:
                    try {
                        input_stream.backup(0);
                        while (curChar <= 13 && (0x2400L & 1L << curChar) != 0L) {
                            curChar = input_stream.BeginToken();
                        }
                    } catch (java.io.IOException e1) {
                        continue EOFLoop;
                    }
                    jjmatchedKind = 0x7fffffff;
                    jjmatchedPos = 0;
                    curPos = jjMoveStringLiteralDfa0_0();
                    if (jjmatchedPos == 0 && jjmatchedKind > 21) {
                        jjmatchedKind = 21;
                    }
                    break;
                case 1:
                    jjmatchedKind = 0x7fffffff;
                    jjmatchedPos = 0;
                    curPos = jjMoveStringLiteralDfa0_1();
                    break;
                case 2:
                    jjmatchedKind = 0x7fffffff;
                    jjmatchedPos = 0;
                    curPos = jjMoveStringLiteralDfa0_2();
                    break;
                case 3:
                    jjmatchedKind = 0x7fffffff;
                    jjmatchedPos = 0;
                    curPos = jjMoveStringLiteralDfa0_3();
                    break;
                case 4:
                    jjmatchedKind = 0x7fffffff;
                    jjmatchedPos = 0;
                    curPos = jjMoveStringLiteralDfa0_4();
                    break;
                case 5:
                    jjmatchedKind = 0x7fffffff;
                    jjmatchedPos = 0;
                    curPos = jjMoveStringLiteralDfa0_5();
                    break;
                default:
                    break;
            }
            if (jjmatchedKind != 0x7fffffff) {
                if (jjmatchedPos + 1 < curPos) {
                    input_stream.backup(curPos - jjmatchedPos - 1);
                }
                if ((jjtoToken[jjmatchedKind >> 6] & 1L << (jjmatchedKind & 077)) != 0L) {
                    matchedToken = jjFillToken();
                    if (jjnewLexState[jjmatchedKind] != -1) {
                        curLexState = jjnewLexState[jjmatchedKind];
                    }
                    return matchedToken;
                } else {
                    if (jjnewLexState[jjmatchedKind] != -1) {
                        curLexState = jjnewLexState[jjmatchedKind];
                    }
                    continue EOFLoop;
                }
            }
            int error_line = input_stream.getEndLine();
            int error_column = input_stream.getEndColumn();
            String error_after = null;
            boolean EOFSeen = false;
            try {
                input_stream.readChar();
                input_stream.backup(1);
            } catch (java.io.IOException e1) {
                EOFSeen = true;
                error_after = curPos <= 1 ? "" : input_stream.GetImage();
                if (curChar == '\n' || curChar == '\r') {
                    error_line++;
                    error_column = 0;
                } else {
                    error_column++;
                }
            }
            if (!EOFSeen) {
                input_stream.backup(1);
                error_after = curPos <= 1 ? "" : input_stream.GetImage();
            }
            throw new TokenMgrError(EOFSeen, curLexState, error_line,
                    error_column, error_after, curChar,
                    TokenMgrError.LEXICAL_ERROR);
        }
    }

    private void jjCheckNAdd(int state) {
        if (jjrounds[state] != jjround) {
            jjstateSet[jjnewStateCnt++] = state;
            jjrounds[state] = jjround;
        }
    }

    private void jjAddStates(int _start, int end) {
        int start = _start;
        do {
            jjstateSet[jjnewStateCnt++] = jjnextStates[start];
        } while (start++ != end);
    }

    private void jjCheckNAddTwoStates(int state1, int state2) {
        jjCheckNAdd(state1);
        jjCheckNAdd(state2);
    }
}
