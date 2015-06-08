/*
 * This file is part of the OWL API.
 *
 * The contents of this file are subject to the LGPL License, Version 3.0.
 *
 * Copyright (C) 2011, The University of Manchester
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0
 * in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 *
 * Copyright 2011, The University of Manchester
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/* Generated By:JavaCC: Do not edit this line. Token.java Version 5.0 */
/* JavaCCOptions:TOKEN_EXTENDS=,KEEP_LINE_COL=null,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package uk.ac.manchester.cs.owlapi.dlsyntax.parser;

/** Describes the input token stream. */
public class Token implements java.io.Serializable {

    /**
     * The version identifier for this Serializable class. Increment only if the
     * <i>serialized</i> form of the class changes.
     */
    private static final long serialVersionUID = 30406L;
    /**
     * An integer that describes the kind of this token. This numbering system
     * is determined by JavaCCParser, and a table of these numbers is stored in
     * the file ...Constants.java.
     */
    public int kind;
    /** The line number of the first character of this Token. */
    public int beginLine;
    /** The column number of the first character of this Token. */
    public int beginColumn;
    /** The line number of the last character of this Token. */
    public int endLine;
    /** The column number of the last character of this Token. */
    public int endColumn;
    /** The string image of the token. */
    public String image;
    /**
     * A reference to the next regular (non-special) token from the input
     * stream. If this is the last token from the input stream, or if the token
     * manager has not read tokens beyond this one, this field is set to null.
     * This is true only if this token is also a regular token. Otherwise, see
     * below for a description of the contents of this field.
     */
    public Token next;
    /**
     * This field is used to access special tokens that occur prior to this
     * token, but after the immediately preceding regular (non-special) token.
     * If there are no such special tokens, this field is set to null. When
     * there are more than one such special token, this field refers to the last
     * of these special tokens, which in turn refers to the next previous
     * special token through its specialToken field, and so on until the first
     * special token (whose specialToken field is null). The next fields of
     * special tokens refer to other special tokens that immediately follow it
     * (without an intervening regular token). If there is no such token, this
     * field is null.
     */
    public Token specialToken;

    /**
     * An optional attribute value of the Token. Tokens which are not used as
     * syntactic sugar will often contain meaningful values that will be used
     * later on by the compiler or interpreter. This attribute value is often
     * different from the image. Any subclass of Token that actually wants to
     * return a non-null value can override this method as appropriate.
     * 
     * @return value
     */
    public Object getValue() {
        return null;
    }

    /** No-argument constructor */
    public Token() {}

    /**
     * Constructs a new token for the specified Image.
     * 
     * @param kind
     *        kind
     */
    public Token(int kind) {
        this(kind, null);
    }

    /**
     * Constructs a new token for the specified Image and Kind.
     * 
     * @param kind
     *        kind
     * @param image
     *        string value
     */
    public Token(int kind, String image) {
        this.kind = kind;
        this.image = image;
    }

    /** Returns the image. */
    @Override
    public String toString() {
        return image;
    }

    /**
     * Returns a new Token object, by default. However, if you want, you can
     * create and return subclass objects based on the value of ofKind. Simply
     * add the cases to the switch for all those special cases. For example, if
     * you have a subclass of Token called IDToken that you want to create if
     * ofKind is ID, simply add something like : case MyParserConstants.ID :
     * return new IDToken(ofKind, image); to the following switch statement.
     * Then you can cast matchedToken variable to the appropriate type and use
     * sit in your lexical actions.
     * 
     * @param ofKind
     *        kind
     * @param image
     *        string value
     * @return token
     */
    public static Token newToken(int ofKind, String image) {
        switch (ofKind) {
            default:
                return new Token(ofKind, image);
        }
    }

    /**
     * @param ofKind
     *        type
     * @return token
     */
    public static Token newToken(int ofKind) {
        return newToken(ofKind, null);
    }
}
/*
 * JavaCC - OriginalChecksum=8dbdb4b8baa2262a655f70097addcae4 (do not edit this
 * line)
 */
