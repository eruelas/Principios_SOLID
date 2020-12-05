/**
 *  <Client.java is part of Dependence Inversion Principle example>
 *     Copyright (C) <2020>  <Emmanuelle Ruelas Gómez>
 *
 *     This file is part of Principios_SOLID project.
 *
 *     Principios_SOLID  is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 *     For more detail contact: eruelas@nerdsystems.net
 */
public class Client {
    private Service service = new Service();
    public void doSomething(){
        doSomethingPhaseOne();
        //service.doSomethingAsync(()->doSomethingPhaseTwo());
        service.doSomethingAsync(this::doSomethingPhaseTwo);
    }
    private void doSomethingPhaseOne(){
        System.out.println("doSomethingPhaseOne");

    }
    public void doSomethingPhaseTwo(){
        System.out.println("doSomethingPhaseTwo");
    }

}
