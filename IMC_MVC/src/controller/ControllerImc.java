package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ModelImc;
import view.ViewImc;

public class ControllerImc implements ActionListener
{
    private final ModelImc modelImc;
    private final ViewImc viewImc;
    
    public ControllerImc(ViewImc viewImc, ModelImc modelImc)
    {
        this.viewImc = viewImc;
        this.modelImc = modelImc;
        viewImc.jb_calcular.addActionListener(this);
        initView();
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
       if(e.getSource()==viewImc.jb_calcular)
       {
           modelImc.setMessage("IMC! "+viewImc.jb_calcular.getText());
           viewImc.jl_peso.setText(modelImc.getMessage());
           viewImc.jl_altura.setText(modelImc.getMessage());
       }
    }

    private void initView() 
    {
        viewImc.setTitle("IMC MVC");
        viewImc.setLocationRelativeTo(null);
        viewImc.jl_peso.setText(modelImc.getMessage());
        viewImc.jl_altura.setText(modelImc.getMessage());
        viewImc.setVisible(true);
    }

}
