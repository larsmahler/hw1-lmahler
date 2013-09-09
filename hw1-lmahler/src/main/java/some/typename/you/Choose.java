

/* First created by JCasGen Sun Sep 08 19:43:02 EDT 2013 */
package some.typename.you;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** This is a test.
<p>
Can you read this?
 * Updated by JCasGen Sun Sep 08 20:10:46 EDT 2013
 * XML source: C:/Users/Lars/workspace_kepler/hw1-lmahler/src/main/resources/hw1-lmahler-typesystem.xml
 * @generated */
public class Choose extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Choose.class);
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
  protected Choose() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Choose(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Choose(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Choose(JCas jcas, int begin, int end) {
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
     
}

    