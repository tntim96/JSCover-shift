package jscovershift;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import com.shapesecurity.shift.ast.Script;
import com.shapesecurity.shift.codegen.CodeGen;
import com.shapesecurity.shift.parser.Parser;
import org.junit.Test;

public class ShiftTest {

  @Test
  public void shouldPAresAndPrint() throws Exception {
    Script script = Parser.parse("x = 1;\ny=2;");
//    Script extra = Parser.parse("z = 3;");
    String codeGen = CodeGen.codeGen(script);
    assertThat(codeGen, equalTo("x=1;y=2"));
  }

}
