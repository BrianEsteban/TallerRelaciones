/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjercicioNo5;

/**
 *
 * @author BRIAN
 */

public class DomainObject {

    private String _id;

    public DomainObject(String _id) {
        this._id = _id;
    }

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }     
}