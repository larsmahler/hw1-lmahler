

/* First created by JCasGen Sun Sep 08 19:34:34 EDT 2013 */
package qa;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** An Annotation type used to annotate the tokens within a {@link Sentence}.<p>
 * Updated by JCasGen Wed Sep 11 11:52:52 EDT 2013
 * XML source: C:/Users/Lars/git/hw1-lmahler/hw1-lmahler/src/main/resources/hw1-lmahler-typesystem.xml
 * @generated */
public class Token extends AbstractSpanAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Token.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Token(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Token(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
  //*--------------*
  //* Feature: word

  /** getter for word - gets the raw text string annotated by the {@link Token}.
   * @generated */
  public String getWord() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_word == null)
      jcasType.jcas.throwFeatMissing("word", "qa.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_word);}
    
  /** setter for word - sets the raw text string annotated by the {@link Token}. 
   * @generated */
  public void setWord(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_word == null)
      jcasType.jcas.throwFeatMissing("word", "qa.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_word, v);}    
   
    
  //*--------------*
  //* Feature: stem

  /** getter for stem - gets the word stem of text string annotated by the {@link Token}. For example, if the raw text string (Token.word) were "living", the word stem (Token.stem) would be "liv".
   * @generated */
  public String getStem() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_stem == null)
      jcasType.jcas.throwFeatMissing("stem", "qa.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_stem);}
    
  /** setter for stem - sets the word stem of text string annotated by the {@link Token}. For example, if the raw text string (Token.word) were "living", the word stem (Token.stem) would be "liv". 
   * @generated */
  public void setStem(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_stem == null)
      jcasType.jcas.throwFeatMissing("stem", "qa.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_stem, v);}    
   
    
  //*--------------*
  //* Feature: pos

  /** getter for pos - gets the Part of Speech of text string annotated by the {@link Token}. Ex: DT (determiner), NN (noun), etc.
   * @generated */
  public String getPos() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_pos == null)
      jcasType.jcas.throwFeatMissing("pos", "qa.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_pos);}
    
  /** setter for pos - sets the Part of Speech of text string annotated by the {@link Token}. Ex: DT (determiner), NN (noun), etc. 
   * @generated */
  public void setPos(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_pos == null)
      jcasType.jcas.throwFeatMissing("pos", "qa.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_pos, v);}    
   
    
  //*--------------*
  //* Feature: orthographicShape

  /** getter for orthographicShape - gets the orthographic shape of text string annotated by the {@link Token}. For example, if the raw text string (Token.word) were "Living", the orthographic shape (Token.orthographicShape) would be "upperInitial". While orthographic shape types may be chosen by the user, here are types commonly used in other applications:
<p>
- upperInitial - initial letter is uppercase, rest are lowercase<br>
- allCaps - all uppercase letters<br>
- lowerCase - all lowercase letters<br>
- mixedCaps - any mixture of upper and lowercase letters not - included in the above categories<br>
   * @generated */
  public String getOrthographicShape() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_orthographicShape == null)
      jcasType.jcas.throwFeatMissing("orthographicShape", "qa.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_orthographicShape);}
    
  /** setter for orthographicShape - sets the orthographic shape of text string annotated by the {@link Token}. For example, if the raw text string (Token.word) were "Living", the orthographic shape (Token.orthographicShape) would be "upperInitial". While orthographic shape types may be chosen by the user, here are types commonly used in other applications:
<p>
- upperInitial - initial letter is uppercase, rest are lowercase<br>
- allCaps - all uppercase letters<br>
- lowerCase - all lowercase letters<br>
- mixedCaps - any mixture of upper and lowercase letters not - included in the above categories<br> 
   * @generated */
  public void setOrthographicShape(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_orthographicShape == null)
      jcasType.jcas.throwFeatMissing("orthographicShape", "qa.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_orthographicShape, v);}    
  }

    