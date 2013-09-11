

/* First created by JCasGen Sun Sep 08 19:34:34 EDT 2013 */
package qa;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** An abstract Annotation type for annotations that cover text spans (as opposed to other media such as images or video).
<p>
Extends {@link AbstractAnnotation}. All other Annotations inherit from AbstractSpanAnnotation. 
<p>
The <b>begin</b> feature indicates the position (offset from the beginning of the document) that indicates where the text span begins.
<p>
The <b>end</b> feature indicates the position (offset from the beginning of the document) that indicates where the text span ends.
<p>
 * Updated by JCasGen Wed Sep 11 11:36:55 EDT 2013
 * XML source: C:/Users/Lars/git/hw1-lmahler/hw1-lmahler/src/main/resources/hw1-lmahler-typesystem.xml
 * @generated */
public class AbstractSpanAnnotation extends AbstractAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AbstractSpanAnnotation.class);
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
  protected AbstractSpanAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AbstractSpanAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AbstractSpanAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public AbstractSpanAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: begin

  /** getter for begin - gets the offset (from the beginning of the document) that indicates where the text span begins.
   * @generated */
  public int getBegin() {
    if (AbstractSpanAnnotation_Type.featOkTst && ((AbstractSpanAnnotation_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "qa.AbstractSpanAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((AbstractSpanAnnotation_Type)jcasType).casFeatCode_begin);}
    
  /** setter for begin - sets the offset (from the beginning of the document) that indicates where the text span begins. 
   * @generated */
  public void setBegin(int v) {
    if (AbstractSpanAnnotation_Type.featOkTst && ((AbstractSpanAnnotation_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "qa.AbstractSpanAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((AbstractSpanAnnotation_Type)jcasType).casFeatCode_begin, v);}    
   
    
  //*--------------*
  //* Feature: end

  /** getter for end - gets the offset (from the beginning of the document) that indicates where the text span ends.
   * @generated */
  public int getEnd() {
    if (AbstractSpanAnnotation_Type.featOkTst && ((AbstractSpanAnnotation_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "qa.AbstractSpanAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((AbstractSpanAnnotation_Type)jcasType).casFeatCode_end);}
    
  /** setter for end - sets the offset (from the beginning of the document) that indicates where the text span ends. 
   * @generated */
  public void setEnd(int v) {
    if (AbstractSpanAnnotation_Type.featOkTst && ((AbstractSpanAnnotation_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "qa.AbstractSpanAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((AbstractSpanAnnotation_Type)jcasType).casFeatCode_end, v);}    
  }

    