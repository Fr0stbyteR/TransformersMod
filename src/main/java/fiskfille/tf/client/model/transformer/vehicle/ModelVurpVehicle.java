package fiskfille.tf.client.model.transformer.vehicle;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelVurpVehicle extends ModelVehicleBase 
{
    public ModelRenderer vehicleBase;
    public ModelRenderer vehicleWaist1;
    public ModelRenderer vehicleWaist2;
    public ModelRenderer vehicleWaistConnector1;
    public ModelRenderer vehicleTorsoconnector1;
    public ModelRenderer vehicleUpperlegR1;
    public ModelRenderer vehicleUpperlegL1;
    public ModelRenderer vehicleRplate1;
    public ModelRenderer vehicleLplate1;
    public ModelRenderer vehicleRearplate;
    public ModelRenderer vehicleUpperlegR2;
    public ModelRenderer vehicleKneeR1;
    public ModelRenderer vehicleLowerlegR1;
    public ModelRenderer vehiclelowerlegR7;
    public ModelRenderer vehicleLowerlegR4;
    public ModelRenderer vehicleLowerlegR5;
    public ModelRenderer vehicleWheelBackR;
    public ModelRenderer vehicleupperlegL2;
    public ModelRenderer vehiclekneeL2;
    public ModelRenderer vehiclelowerlegL1;
    public ModelRenderer vehiclelowerlegL7;
    public ModelRenderer vehiclelowerlegL4;
    public ModelRenderer vehiclelowerlegL5;
    public ModelRenderer vehiclewheelbackL;
    public ModelRenderer vehicletorsobase;
    public ModelRenderer vehiclehood1;
    public ModelRenderer vehiclefrontR1;
    public ModelRenderer vehiclefrontL1;
    public ModelRenderer vehiclebackplate1;
    public ModelRenderer vehiclebackplate2;
    public ModelRenderer vehiclewheelR;
    public ModelRenderer vehiclewheelL;
    public ModelRenderer vehiclearmbaseR1;
    public ModelRenderer vehiclearmbaseL1;
    public ModelRenderer vehiclewindow1;
    public ModelRenderer vehiclebaseplate;
    public ModelRenderer vehiclehood2;
    public ModelRenderer vehiclehood3;
    public ModelRenderer vehiclehood4;
    public ModelRenderer vehiclefrontR2;
    public ModelRenderer vehiclefrontL2;
    public ModelRenderer vehicleupperarmR1;
    public ModelRenderer vehicleshoulderL1;
    public ModelRenderer vehiclelowerarmR1;
    public ModelRenderer vehiclelowerarmR2;
    public ModelRenderer vehicleUpperarmL1;
    public ModelRenderer vehicleshoulderL1_1;
    public ModelRenderer vehicleLowerarmL1;
    public ModelRenderer vehicleLowerarmL2;
    public ModelRenderer vehicleWindow2;
    public ModelRenderer vehiclerear1;
    public ModelRenderer vehicleRear2;

    public ModelVurpVehicle() 
    {
        this.textureWidth = 128;
        this.textureHeight = 128;
        
        this.vehiclebackplate2 = new ModelRenderer(this, 51, 74);
        this.vehiclebackplate2.mirror = true;
        this.vehiclebackplate2.setRotationPoint(-2.3F, -1.8F, 1.8F);
        this.vehiclebackplate2.addBox(-3.0F, -2.0F, 0.0F, 3, 5, 1);
        this.setRotateAngle(vehiclebackplate2, 1.5882496193148399F, 0.017453292519943295F, -1.5707963267948966F);
        this.vehicleWaistConnector1 = new ModelRenderer(this, 4, 64);
        this.vehicleWaistConnector1.setRotationPoint(0.0F, 2.0F, -1.0F);
        this.vehicleWaistConnector1.addBox(-1.0F, -0.1F, -2.3F, 2, 3, 4);
        this.setRotateAngle(vehicleWaistConnector1, 1.5707963267948966F, 0.0F, 0.0F);
        this.vehiclewindow1 = new ModelRenderer(this, 0, 7);
        this.vehiclewindow1.setRotationPoint(0.0F, -1.9F, -1.2F);
        this.vehiclewindow1.addBox(-2.5F, -0.2F, 0.0F, 5, 2, 3);
        this.setRotateAngle(vehiclewindow1, 0.33161255787892263F, 0.0F, 0.0F);
        this.vehicleLowerlegR1 = new ModelRenderer(this, 0, 77);
        this.vehicleLowerlegR1.setRotationPoint(-0.8F, 2.0F, 1.5F);
        this.vehicleLowerlegR1.addBox(-1.5F, 0.0F, 0.0F, 3, 6, 2);
        this.setRotateAngle(vehicleLowerlegR1, 3.141592653589793F, 0.0F, -0.017453292519943295F);
        this.vehiclelowerlegL1 = new ModelRenderer(this, 0, 77);
        this.vehiclelowerlegL1.mirror = true;
        this.vehiclelowerlegL1.setRotationPoint(0.8F, 2.0F, 1.5F);
        this.vehiclelowerlegL1.addBox(-1.5F, 0.0F, 0.0F, 3, 6, 2);
        this.setRotateAngle(vehiclelowerlegL1, 3.141592653589793F, 0.0F, 0.017453292519943295F);
        this.vehicleLowerarmL1 = new ModelRenderer(this, 64, 65);
        this.vehicleLowerarmL1.setRotationPoint(0.0F, 3.3F, 0.4F);
        this.vehicleLowerarmL1.addBox(-1.1F, -0.2F, -1.6F, 2, 4, 3);
        this.setRotateAngle(vehicleLowerarmL1, -3.141592653589793F, 0.0F, 0.0F);
        this.vehiclewheelR = new ModelRenderer(this, 55, 68);
        this.vehiclewheelR.setRotationPoint(-2.7F, 0.3F, -2.0F);
        this.vehiclewheelR.addBox(-1.0F, -1.0F, -1.0F, 1, 2, 2);
        this.vehiclefrontL2 = new ModelRenderer(this, 48, 70);
        this.vehiclefrontL2.mirror = true;
        this.vehiclefrontL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.vehiclefrontL2.addBox(-0.5F, -2.0F, -3.7F, 2, 1, 3);
        this.setRotateAngle(vehiclefrontL2, 0.24434609527920614F, 0.0F, 0.017453292519943295F);
        this.vehicleWaist2 = new ModelRenderer(this, 0, 64);
        this.vehicleWaist2.setRotationPoint(0.0F, 7.0F, 1.5F);
        this.vehicleWaist2.addBox(-3.0F, 0.0F, 0.0F, 3, 2, 1);
        this.setRotateAngle(vehicleWaist2, -1.5707963267948966F, 0.0F, -3.211405823669566F);
        this.vehicleupperarmR1 = new ModelRenderer(this, 74, 60);
        this.vehicleupperarmR1.setRotationPoint(-1.5F, 0.0F, 1.0F);
        this.vehicleupperarmR1.addBox(0.0F, 0.8F, -0.5F, 1, 3, 1);
        this.setRotateAngle(vehicleupperarmR1, 1.5707963267948966F, 0.0F, 0.0F);
        this.vehiclehood3 = new ModelRenderer(this, 47, 65);
        this.vehiclehood3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.vehiclehood3.addBox(-1.8F, -3.3F, -1.0F, 1, 4, 1);
        this.setRotateAngle(vehiclehood3, -0.005235987755982988F, 0.003490658503988659F, -0.22165681500327983F);
        this.vehicleTorsoconnector1 = new ModelRenderer(this, 35, 60);
        this.vehicleTorsoconnector1.setRotationPoint(0.0F, 0.1F, -0.4F);
        this.vehicleTorsoconnector1.addBox(-1.2F, -4.0F, -0.8F, 2, 4, 2);
        this.setRotateAngle(vehicleTorsoconnector1, 0.0F, 0.7853981633974483F, 0.0F);
        this.vehiclelowerlegL5 = new ModelRenderer(this, 16, 75);
        this.vehiclelowerlegL5.mirror = true;
        this.vehiclelowerlegL5.setRotationPoint(1.4F, 0.0F, 0.0F);
        this.vehiclelowerlegL5.addBox(-1.0F, 0.0F, 0.0F, 1, 6, 1);
        this.setRotateAngle(vehiclelowerlegL5, -0.15707963267948966F, 0.06981317007977318F, 0.05235987755982988F);
        this.vehiclehood2 = new ModelRenderer(this, 47, 65);
        this.vehiclehood2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.vehiclehood2.addBox(0.8F, -3.3F, -1.0F, 1, 4, 1);
        this.setRotateAngle(vehiclehood2, -0.005235987755982988F, 0.003490658503988659F, 0.22165681500327983F);
        this.vehicleLowerlegR5 = new ModelRenderer(this, 16, 75);
        this.vehicleLowerlegR5.setRotationPoint(-1.4F, 0.0F, 0.0F);
        this.vehicleLowerlegR5.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1);
        this.setRotateAngle(vehicleLowerlegR5, -0.15707963267948966F, -0.06981317007977318F, -0.05235987755982988F);
        this.vehiclelowerlegL4 = new ModelRenderer(this, 8, 83);
        this.vehiclelowerlegL4.setRotationPoint(-0.3F, 2.5F, 0.9F);
        this.vehiclelowerlegL4.addBox(-0.5F, -2.0F, -2.0F, 1, 3, 2);
        this.setRotateAngle(vehiclelowerlegL4, 0.15707963267948966F, -0.10471975511965977F, 0.08726646259971647F);
        this.vehiclehood4 = new ModelRenderer(this, 51, 65);
        this.vehiclehood4.setRotationPoint(0.0F, -0.2F, 0.0F);
        this.vehiclehood4.addBox(-1.5F, -0.7F, -1.4F, 3, 2, 1);
        this.setRotateAngle(vehiclehood4, 1.3526301702956054F, 0.0F, 0.0F);
        this.vehicleWindow2 = new ModelRenderer(this, 0, 24);
        this.vehicleWindow2.setRotationPoint(0.0F, -0.2F, 3.0F);
        this.vehicleWindow2.addBox(-2.5F, 0.0F, 0.0F, 5, 1, 2);
        this.setRotateAngle(vehicleWindow2, -0.20943951023931953F, 0.0F, 0.0F);
        this.vehiclelowerlegR7 = new ModelRenderer(this, 14, 85);
        this.vehiclelowerlegR7.setRotationPoint(0.5F, 1.0F, 1.6F);
        this.vehiclelowerlegR7.addBox(-2.4F, -0.5F, -1.0F, 3, 2, 1);
        this.setRotateAngle(vehiclelowerlegR7, 0.6108652381980153F, -0.05235987755982988F, 0.0F);
        this.vehiclelowerarmR2 = new ModelRenderer(this, 74, 68);
        this.vehiclelowerarmR2.setRotationPoint(-1.5F, 3.5F, 0.0F);
        this.vehiclelowerarmR2.addBox(0.0F, -3.0F, -1.9F, 1, 3, 2);
        this.setRotateAngle(vehiclelowerarmR2, 0.03490658503988659F, -0.2617993877991494F, -0.10122909661567112F);
        this.vehicleRplate1 = new ModelRenderer(this, 0, 17);
        this.vehicleRplate1.setRotationPoint(0.0F, 0.4F, 0.3F);
        this.vehicleRplate1.addBox(-3.4F, -0.9F, -5.2F, 3, 1, 6);
        this.setRotateAngle(vehicleRplate1, 0.061086523819801536F, 0.05235987755982988F, -0.017453292519943295F);
        this.vehiclefrontL1 = new ModelRenderer(this, 35, 77);
        this.vehiclefrontL1.mirror = true;
        this.vehiclefrontL1.setRotationPoint(1.8F, -0.1F, -0.9F);
        this.vehiclefrontL1.addBox(-0.5F, -1.0F, -4.0F, 2, 2, 3);
        this.vehiclebaseplate = new ModelRenderer(this, 13, 0);
        this.vehiclebaseplate.setRotationPoint(-2.5F, 0.1F, -4.5F);
        this.vehiclebaseplate.addBox(0.0F, 0.0F, 0.0F, 5, 1, 13);
        this.vehiclebackplate1 = new ModelRenderer(this, 51, 74);
        this.vehiclebackplate1.setRotationPoint(2.3F, -1.8F, 1.8F);
        this.vehiclebackplate1.addBox(0.0F, -2.0F, 0.0F, 3, 5, 1);
        this.setRotateAngle(vehiclebackplate1, 1.5882496193148399F, -0.017453292519943295F, 1.5707963267948966F);
        this.vehicleLplate1 = new ModelRenderer(this, 0, 17);
        this.vehicleLplate1.mirror = true;
        this.vehicleLplate1.setRotationPoint(0.0F, 0.4F, 0.3F);
        this.vehicleLplate1.addBox(0.4F, -0.9F, -5.2F, 3, 1, 6);
        this.setRotateAngle(vehicleLplate1, 0.061086523819801536F, -0.05235987755982988F, 0.017453292519943295F);
        this.vehiclelowerarmR1 = new ModelRenderer(this, 64, 65);
        this.vehiclelowerarmR1.mirror = true;
        this.vehiclelowerarmR1.setRotationPoint(1.0F, 3.3F, 0.4F);
        this.vehiclelowerarmR1.addBox(-0.9F, -0.2F, -1.6F, 2, 4, 3);
        this.setRotateAngle(vehiclelowerarmR1, -3.141592653589793F, 0.0F, 0.0F);
        this.vehiclerear1 = new ModelRenderer(this, 0, 0);
        this.vehiclerear1.setRotationPoint(0.0F, 0.3F, 4.0F);
        this.vehiclerear1.addBox(-2.5F, 0.1F, 0.0F, 5, 2, 5);
        this.setRotateAngle(vehiclerear1, -0.3141592653589793F, 0.0F, 0.0F);
        this.vehiclearmbaseR1 = new ModelRenderer(this, 64, 60);
        this.vehiclearmbaseR1.setRotationPoint(-1.0F, -0.4F, 1.0F);
        this.vehiclearmbaseR1.addBox(-2.0F, -1.0F, -1.0F, 2, 2, 3);
        this.vehicleWaist1 = new ModelRenderer(this, 0, 64);
        this.vehicleWaist1.mirror = true;
        this.vehicleWaist1.setRotationPoint(0.0F, 7.0F, 1.5F);
        this.vehicleWaist1.addBox(0.0F, 0.0F, 0.0F, 3, 2, 1);
        this.setRotateAngle(vehicleWaist1, -1.5707963267948966F, 0.0F, 3.211405823669566F);
        this.vehiclelowerlegL7 = new ModelRenderer(this, 14, 85);
        this.vehiclelowerlegL7.mirror = true;
        this.vehiclelowerlegL7.setRotationPoint(-0.5F, 1.0F, 1.6F);
        this.vehiclelowerlegL7.addBox(-0.6F, -0.5F, -1.0F, 3, 2, 1);
        this.setRotateAngle(vehiclelowerlegL7, 0.6108652381980153F, 0.05235987755982988F, 0.0F);
        this.vehicleshoulderL1_1 = new ModelRenderer(this, 78, 60);
        this.vehicleshoulderL1_1.mirror = true;
        this.vehicleshoulderL1_1.setRotationPoint(2.3F, 0.0F, -1.6F);
        this.vehicleshoulderL1_1.addBox(-1.0F, -1.4F, -1.5F, 1, 3, 3);
        this.setRotateAngle(vehicleshoulderL1_1, -0.019198621771937624F, 0.0F, 0.0F);
        this.vehicleshoulderL1 = new ModelRenderer(this, 78, 60);
        this.vehicleshoulderL1.setRotationPoint(-2.3F, 0.0F, -1.6F);
        this.vehicleshoulderL1.addBox(0.0F, -1.4F, -1.5F, 1, 3, 3);
        this.setRotateAngle(vehicleshoulderL1, -0.019198621771937624F, 0.0F, 0.0F);
        this.vehiclefrontR1 = new ModelRenderer(this, 35, 77);
        this.vehiclefrontR1.setRotationPoint(-1.8F, -0.1F, -0.9F);
        this.vehiclefrontR1.addBox(-1.5F, -1.0F, -4.0F, 2, 2, 3);
        this.vehicleUpperlegR2 = new ModelRenderer(this, 6, 72);
        this.vehicleUpperlegR2.setRotationPoint(-2.0F, -0.5F, -0.5F);
        this.vehicleUpperlegR2.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1);
        this.setRotateAngle(vehicleUpperlegR2, 0.0F, 0.05235987755982988F, -0.03490658503988659F);
        this.vehicleupperlegL2 = new ModelRenderer(this, 6, 72);
        this.vehicleupperlegL2.setRotationPoint(2.0F, -0.5F, -0.5F);
        this.vehicleupperlegL2.addBox(-1.0F, 0.0F, 0.0F, 1, 4, 1);
        this.setRotateAngle(vehicleupperlegL2, 0.0F, -0.05235987755982988F, 0.03490658503988659F);
        this.vehiclekneeL2 = new ModelRenderer(this, 10, 71);
        this.vehiclekneeL2.setRotationPoint(0.0F, 2.7F, 0.0F);
        this.vehiclekneeL2.addBox(0.0F, 0.0F, -1.0F, 2, 2, 2);
        this.vehicleUpperlegR1 = new ModelRenderer(this, 0, 71);
        this.vehicleUpperlegR1.setRotationPoint(-1.0F, 1.0F, 0.0F);
        this.vehicleUpperlegR1.addBox(-1.0F, -1.0F, -1.0F, 1, 4, 2);
        this.setRotateAngle(vehicleUpperlegR1, -1.5707963267948966F, 0.0F, 0.0F);
        this.vehiclefrontR2 = new ModelRenderer(this, 48, 70);
        this.vehiclefrontR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.vehiclefrontR2.addBox(-1.5F, -2.0F, -3.7F, 2, 1, 3);
        this.setRotateAngle(vehiclefrontR2, 0.24434609527920614F, 0.0F, -0.017453292519943295F);
        this.vehicleKneeR1 = new ModelRenderer(this, 10, 71);
        this.vehicleKneeR1.setRotationPoint(0.0F, 2.7F, 0.0F);
        this.vehicleKneeR1.addBox(-2.0F, 0.0F, -1.0F, 2, 2, 2);
        this.vehicleUpperarmL1 = new ModelRenderer(this, 74, 60);
        this.vehicleUpperarmL1.mirror = true;
        this.vehicleUpperarmL1.setRotationPoint(0.5F, 0.0F, 1.0F);
        this.vehicleUpperarmL1.addBox(0.0F, 0.8F, -0.5F, 1, 3, 1);
        this.setRotateAngle(vehicleUpperarmL1, 1.5707963267948966F, 0.0F, 0.0F);
        this.vehicleLowerarmL2 = new ModelRenderer(this, 74, 68);
        this.vehicleLowerarmL2.mirror = true;
        this.vehicleLowerarmL2.setRotationPoint(1.5F, 3.5F, 0.0F);
        this.vehicleLowerarmL2.addBox(-1.0F, -3.0F, -1.9F, 1, 3, 2);
        this.setRotateAngle(vehicleLowerarmL2, 0.03490658503988659F, 0.2617993877991494F, 0.10122909661567112F);
        this.vehicleWheelBackR = new ModelRenderer(this, 15, 82);
        this.vehicleWheelBackR.setRotationPoint(-1.0F, 3.0F, 2.2F);
        this.vehicleWheelBackR.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 1);
        this.setRotateAngle(vehicleWheelBackR, 0.0F, -1.5707963267948966F, 0.0F);
        this.vehicleLowerlegR4 = new ModelRenderer(this, 8, 83);
        this.vehicleLowerlegR4.setRotationPoint(0.3F, 2.5F, 0.9F);
        this.vehicleLowerlegR4.addBox(-0.5F, -2.0F, -2.0F, 1, 3, 2);
        this.setRotateAngle(vehicleLowerlegR4, 0.15707963267948966F, 0.10471975511965977F, -0.08726646259971647F);
        this.vehicleUpperlegL1 = new ModelRenderer(this, 0, 71);
        this.vehicleUpperlegL1.setRotationPoint(1.0F, 1.0F, 0.0F);
        this.vehicleUpperlegL1.addBox(0.0F, -1.0F, -1.0F, 1, 4, 2);
        this.setRotateAngle(vehicleUpperlegL1, -1.5707963267948966F, 0.0F, 0.0F);
        this.vehicleRear2 = new ModelRenderer(this, 0, 27);
        this.vehicleRear2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.vehicleRear2.addBox(-2.5F, 0.0F, 0.0F, 5, 1, 2);
        this.setRotateAngle(vehicleRear2, -0.19198621771937624F, 0.0F, 0.0F);
        this.vehicleRearplate = new ModelRenderer(this, 0, 12);
        this.vehicleRearplate.setRotationPoint(0.0F, 0.6F, -1.1F);
        this.vehicleRearplate.addBox(-1.5F, -1.0F, -4.0F, 3, 1, 4);
        this.vehicleBase = new ModelRenderer(this, 0, 60);
        this.vehicleBase.setRotationPoint(0.0F, 22.3F, 1.0F);
        this.vehicleBase.addBox(-2.0F, 0.0F, -1.0F, 4, 1, 3);
        this.setRotateAngle(vehicleBase, 1.5707963267948966F, 0.0F, 0.0F);
        this.vehiclehood1 = new ModelRenderer(this, 47, 60);
        this.vehiclehood1.setRotationPoint(0.0F, -0.5F, -3.8F);
        this.vehiclehood1.addBox(-1.5F, -3.0F, -1.0F, 3, 4, 1);
        this.setRotateAngle(vehiclehood1, -1.3439035240356336F, 0.0F, 0.0F);
        this.vehiclewheelbackL = new ModelRenderer(this, 15, 82);
        this.vehiclewheelbackL.mirror = true;
        this.vehiclewheelbackL.setRotationPoint(1.0F, 3.0F, 2.3F);
        this.vehiclewheelbackL.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 1);
        this.setRotateAngle(vehiclewheelbackL, 0.0F, 1.5707963267948966F, 0.0F);
        this.vehiclewheelL = new ModelRenderer(this, 55, 68);
        this.vehiclewheelL.mirror = true;
        this.vehiclewheelL.setRotationPoint(2.6F, 0.3F, -2.0F);
        this.vehiclewheelL.addBox(0.0F, -1.0F, -1.0F, 1, 2, 2);
        this.vehiclearmbaseL1 = new ModelRenderer(this, 64, 60);
        this.vehiclearmbaseL1.mirror = true;
        this.vehiclearmbaseL1.setRotationPoint(1.0F, -0.4F, 1.0F);
        this.vehiclearmbaseL1.addBox(0.0F, -1.0F, -1.0F, 2, 2, 3);
        this.vehicletorsobase = new ModelRenderer(this, 35, 66);
        this.vehicletorsobase.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.vehicletorsobase.addBox(-2.0F, -2.0F, -1.3F, 4, 3, 4);
        this.setRotateAngle(vehicletorsobase, -1.5707963267948966F, -0.7853981633974483F, 0.0F);
     
        this.vehicleWaistConnector1.addChild(this.vehicleRearplate);
        this.vehicletorsobase.addChild(this.vehiclehood1);
        this.vehiclelowerlegL1.addChild(this.vehiclewheelbackL);
        this.vehicletorsobase.addChild(this.vehiclewheelL);
        this.vehicletorsobase.addChild(this.vehiclearmbaseL1);
        this.vehicleTorsoconnector1.addChild(this.vehicletorsobase);
        this.vehicletorsobase.addChild(this.vehiclebackplate2);
        this.vehicleBase.addChild(this.vehicleWaistConnector1);
        this.vehicletorsobase.addChild(this.vehiclewindow1);
        this.vehicleKneeR1.addChild(this.vehicleLowerlegR1);
        this.vehiclekneeL2.addChild(this.vehiclelowerlegL1);
        this.vehicleUpperarmL1.addChild(this.vehicleLowerarmL1);
        this.vehicletorsobase.addChild(this.vehiclewheelR);
        this.vehiclefrontL1.addChild(this.vehiclefrontL2);
        this.vehicleBase.addChild(this.vehicleWaist2);
        this.vehiclearmbaseR1.addChild(this.vehicleupperarmR1);
        this.vehiclehood1.addChild(this.vehiclehood3);
        this.vehicleBase.addChild(this.vehicleTorsoconnector1);
        this.vehiclelowerlegL1.addChild(this.vehiclelowerlegL5);
        this.vehiclehood1.addChild(this.vehiclehood2);
        this.vehicleLowerlegR1.addChild(this.vehicleLowerlegR5);
        this.vehiclelowerlegL1.addChild(this.vehiclelowerlegL4);
        this.vehiclehood1.addChild(this.vehiclehood4);
        this.vehiclewindow1.addChild(this.vehicleWindow2);
        this.vehicleKneeR1.addChild(this.vehiclelowerlegR7);
        this.vehiclelowerarmR1.addChild(this.vehiclelowerarmR2);
        this.vehicleWaistConnector1.addChild(this.vehicleRplate1);
        this.vehicletorsobase.addChild(this.vehiclefrontL1);
        this.vehicletorsobase.addChild(this.vehiclebaseplate);
        this.vehicletorsobase.addChild(this.vehiclebackplate1);
        this.vehicleWaistConnector1.addChild(this.vehicleLplate1);
        this.vehicleWindow2.addChild(this.vehiclerear1);
        this.vehicleBase.addChild(this.vehicleWaist1);
        this.vehicletorsobase.addChild(this.vehiclearmbaseR1);
        this.vehiclekneeL2.addChild(this.vehiclelowerlegL7);
        this.vehiclearmbaseL1.addChild(this.vehicleshoulderL1_1);
        this.vehiclearmbaseR1.addChild(this.vehicleshoulderL1);
        this.vehicletorsobase.addChild(this.vehiclefrontR1);
        this.vehicleUpperlegR1.addChild(this.vehicleUpperlegR2);
        this.vehicleUpperlegL1.addChild(this.vehicleupperlegL2);
        this.vehicleUpperlegL1.addChild(this.vehiclekneeL2);
        this.vehicleWaistConnector1.addChild(this.vehicleUpperlegR1);
        this.vehiclefrontR1.addChild(this.vehiclefrontR2);
        this.vehicleUpperlegR1.addChild(this.vehicleKneeR1);
        this.vehiclearmbaseL1.addChild(this.vehicleUpperarmL1);
        this.vehicleWaistConnector1.addChild(this.vehicleUpperlegL1);
        this.vehicleWindow2.addChild(this.vehicleRear2);
        this.vehicleLowerlegR1.addChild(this.vehicleLowerlegR4);
        this.vehicleLowerlegR1.addChild(this.vehicleWheelBackR);
        this.vehicleLowerarmL1.addChild(this.vehicleLowerarmL2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    { 
        this.vehicleBase.render(f5);
    }
    
    @Override
    public void render()
    { 
        this.vehicleBase.render(0.0625F);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) 
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
