//
// Generated by JTB 1.3.2
//

package visitor;
import syntaxtree.*;
import java.util.*;

/**
 * All GJ visitors must implement this interface.
 */

public interface GJVisitor<R,A> {

   //
   // GJ Auto class visitors
   //

   public R visit(NodeList n, A argu);
   public R visit(NodeListOptional n, A argu);
   public R visit(NodeOptional n, A argu);
   public R visit(NodeSequence n, A argu);
   public R visit(NodeToken n, A argu);

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> ( Line() )*
    * f1 -> <EOF>
    */
   public R visit(Goal n, A argu);

   /**
    * f0 -> Expression()
    */
   public R visit(Line n, A argu);

   /**
    * f0 -> IntegerLiteral()
    *       | TrueLiteral()
    *       | FalseLiteral()
    *       | Identifier()
    *       | ListExpr()
    *       | PlusExpression()
    *       | MinusExpression()
    *       | MultiplyExpression()
    *       | DivideExpression()
    *       | GTExpression()
    *       | LTExpression()
    *       | EQExpression()
    *       | IfExpression()
    *       | DefineExpression()
    *       | Assignment()
    *       | ProcedureExp()
    *       | CarExpr()
    *       | CdrExpr()
    *       | Application()
    */
   public R visit(Expression n, A argu);

   /**
    * f0 -> <INTEGER_LITERAL>
    */
   public R visit(IntegerLiteral n, A argu);

   /**
    * f0 -> "#t"
    */
   public R visit(TrueLiteral n, A argu);

   /**
    * f0 -> "#f"
    */
   public R visit(FalseLiteral n, A argu);

   /**
    * f0 -> "("
    * f1 -> "list "
    * f2 -> ( IntegerLiteral() )*
    * f3 -> ")"
    */
   public R visit(ListExpr n, A argu);

   /**
    * f0 -> "("
    * f1 -> "+"
    * f2 -> Expression()
    * f3 -> Expression()
    * f4 -> ")"
    */
   public R visit(PlusExpression n, A argu);

   /**
    * f0 -> "("
    * f1 -> "-"
    * f2 -> Expression()
    * f3 -> Expression()
    * f4 -> ")"
    */
   public R visit(MinusExpression n, A argu);

   /**
    * f0 -> "("
    * f1 -> "*"
    * f2 -> Expression()
    * f3 -> Expression()
    * f4 -> ")"
    */
   public R visit(MultiplyExpression n, A argu);

   /**
    * f0 -> "("
    * f1 -> "/"
    * f2 -> Expression()
    * f3 -> Expression()
    * f4 -> ")"
    */
   public R visit(DivideExpression n, A argu);

   /**
    * f0 -> "("
    * f1 -> ">"
    * f2 -> Expression()
    * f3 -> Expression()
    * f4 -> ")"
    */
   public R visit(GTExpression n, A argu);

   /**
    * f0 -> "("
    * f1 -> "<"
    * f2 -> Expression()
    * f3 -> Expression()
    * f4 -> ")"
    */
   public R visit(LTExpression n, A argu);

   /**
    * f0 -> "("
    * f1 -> "="
    * f2 -> Expression()
    * f3 -> Expression()
    * f4 -> ")"
    */
   public R visit(EQExpression n, A argu);

   /**
    * f0 -> "("
    * f1 -> "if"
    * f2 -> Expression()
    * f3 -> Expression()
    * f4 -> Expression()
    * f5 -> ")"
    */
   public R visit(IfExpression n, A argu);

   /**
    * f0 -> "("
    * f1 -> "define"
    * f2 -> Identifier()
    * f3 -> Expression()
    * f4 -> ")"
    */
   public R visit(DefineExpression n, A argu);

   /**
    * f0 -> <IDENTIFIER>
    */
   public R visit(Identifier n, A argu);

   /**
    * f0 -> "("
    * f1 -> "car"
    * f2 -> Expression()
    * f3 -> ")"
    */
   public R visit(CarExpr n, A argu);

   /**
    * f0 -> "("
    * f1 -> "cdr"
    * f2 -> Expression()
    * f3 -> ")"
    */
   public R visit(CdrExpr n, A argu);

   /**
    * f0 -> "("
    * f1 -> "set!"
    * f2 -> Identifier()
    * f3 -> Expression()
    * f4 -> ")"
    */
   public R visit(Assignment n, A argu);

   /**
    * f0 -> "("
    * f1 -> "lambda"
    * f2 -> "("
    * f3 -> ( Identifier() )*
    * f4 -> ")"
    * f5 -> Expression()
    * f6 -> ")"
    */
   public R visit(ProcedureExp n, A argu);

   /**
    * f0 -> "("
    * f1 -> Expression()
    * f2 -> ( Expression() )*
    * f3 -> ")"
    */
   public R visit(Application n, A argu);

}
