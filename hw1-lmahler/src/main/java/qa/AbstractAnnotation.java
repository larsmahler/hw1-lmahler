
/* First created by JCasGen Sun Sep 08 19:34:34 EDT 2013 */
package qa;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;

/** The most abstract Annotation type in this namespace. All other Annotations inherit from AbstractAnnotation.
 * Updated by JCasGen Sun Sep 08 20:50:41 EDT 2013
 * XML source: C:/Users/Lars/git/hw1-lmahler/hw1-lmahler/src/main/resources/hw1-lmahler-typesystem.xml
 * @generated */
public class AbstractAnnotation extends Annotation {
  /**
   * @generated
   * @ordered
   */
  @SuppressWarnings("hiding")
  public final static int typeIndexID = JCasRegistry.register(AbstractAnnotation.class);

  /**
   * @generated
   * @ordered
   */
  @SuppressWarnings("hiding")
  public final static int type = typeIndexID;

  /** @generated */
  @Override
  public int getTypeIndexID() {return typeIndexID;}
 
  /**
   * Never called. Disable default constructor
   * 
   * @generated
   */
  protected AbstractAnnotation() {/* intentionally empty block */}
    
  /**
   * Internal - constructor used by generator
   * 
   * @generated
   */
  public AbstractAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AbstractAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */
  public AbstractAnnotation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc --> Write your own initialization here <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/* default - does nothing empty block */
  }

  // *--------------*
  // * Feature: source

  /**
   * getter for source - gets
   * 
   * @generated
   */
  public String getSource() {
    if (AbstractAnnotation_Type.featOkTst && ((AbstractAnnotation_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "qa.AbstractAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AbstractAnnotation_Type)jcasType).casFeatCode_source);}
    
  /**
   * setter for source - sets
   * 
   * @generated
   */
  public void setSource(String v) {
    if (AbstractAnnotation_Type.featOkTst && ((AbstractAnnotation_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "qa.AbstractAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((AbstractAnnotation_Type)jcasType).casFeatCode_source, v);}    
   
    
  // *--------------*
  // * Feature: confidence

  /**
   * getter for confidence - gets
   * 
   * @generated
   */
  public double getConfidence() {
    if (AbstractAnnotation_Type.featOkTst && ((AbstractAnnotation_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "qa.AbstractAnnotation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((AbstractAnnotation_Type)jcasType).casFeatCode_confidence);}
    
  /**
   * setter for confidence - sets
   * 
   * @generated
   */
  public void setConfidence(double v) {
    if (AbstractAnnotation_Type.featOkTst && ((AbstractAnnotation_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "qa.AbstractAnnotation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((AbstractAnnotation_Type)jcasType).casFeatCode_confidence, v);}    
  }
